package com.unisender;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import com.unisender.entities.EmailMessage;
import com.unisender.entities.MailList;
import com.unisender.exceptions.UniSenderConnectException;
import com.unisender.requests.BatchSendEmailRequest;
import com.unisender.responses.SendEmailResponse;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author AYeremenok
 */
public class UnisenderTest {

    private static final String MAIL_1 = "to1@test.com";
    private static final String MAIL_2 = "to2@test.com";
    private static final String SENDER_NAME = "Sender";
    private static final String SENDER_EMAIL = "from@test.com";
    private static final String SUBJECT_1 = "Subject1";
    private static final String SUBJECT_2 = "Subject2";
    private static final String BODY_1 = "<html>body1</html>";
    private static final String BODY_2 = "<html>body2</html>";
    private static final String USER_CAMPAIGN_ID = UUID.randomUUID().toString();
    private static final String REPLY_TO = "noreply@test.tt";

    private UniSender uniSender;
    private MailList mailList;

    private String nextResponse;
    private String lastPostQuery;

    @Before
    public void setUp() throws Exception {
        uniSender = new UniSender("apikey") {
            @Override
            protected String execute(URL url, String postQuery) throws UniSenderConnectException {
                lastPostQuery = postQuery;
                return nextResponse;
            }
        };
        mailList = new MailList(0);
    }

    @Test
    public void testBatchSend() throws Exception {
        Map<String, EmailMessage> messages = createMap(
                MAIL_1, new EmailMessage(SENDER_NAME, SENDER_EMAIL, SUBJECT_1, BODY_1),
                MAIL_2, new EmailMessage(SENDER_NAME, SENDER_EMAIL, SUBJECT_2, BODY_2)
        );
        messages.get(MAIL_1).setReplyTo(REPLY_TO);

        BatchSendEmailRequest request = new BatchSendEmailRequest(messages, mailList, null, null, null, USER_CAMPAIGN_ID);

        nextResponse = toJsonMessages(createMap(MAIL_1, "", MAIL_2, ""));
        List<SendEmailResponse> responses = uniSender.batchSendEmail(request);

        assertEquals(2, responses.size());
        SendEmailResponse response1 = responses.get(0);
        SendEmailResponse response2 = responses.get(1);

        assertEquals("", response1.getError());
        assertEquals(MAIL_1, response1.getEmail());
        assertEquals("", response2.getError());
        assertEquals(MAIL_2, response2.getEmail());

        assertLastQueryContains("email[0]=" + MAIL_1);
        assertLastQueryContains("subject[0]=" + SUBJECT_1);
        assertLastQueryContains("body[0]=" + BODY_1);
        assertLastQueryContains("email[1]=" + MAIL_2);
        assertLastQueryContains("subject[1]=" + SUBJECT_2);
        assertLastQueryContains("body[1]=" + BODY_2);
        assertLastQueryContains("user_campaign_id=" + USER_CAMPAIGN_ID);
        assertLastQueryContains("headers[0]=Reply-To:" + REPLY_TO);
    }

    @Test
    public void testCheckEmail() throws Exception {
        Set<String> ids = new HashSet<String>(asList("59847824", "59847829", "59847834"));
        nextResponse =
                "{\"result\":{\"statuses\":[" +
                        "{\"id\":59847824,\"status\":\"ok_sent\"}," +
                        "{\"id\":59847829,\"status\":\"err_not_sent\"}," +
                        "{\"id\":59847834,\"status\":\"ok_sent\"}" +
                "]}}";
        Map<String, String> response = uniSender.checkEmail(ids);
        assertLastQueryContains("59847824");
        assertLastQueryContains("59847829");
        assertLastQueryContains("59847834");

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("59847824", "ok_sent");
        expected.put("59847829", "err_not_sent");
        expected.put("59847834", "ok_sent");
        assertEquals(expected, response);
    }

    private void assertLastQueryContains(String substring) throws UnsupportedEncodingException {
        String decodedQuery = URLDecoder.decode(lastPostQuery, UniSender.API_ENCODING);
        assertTrue(String.format("%s\n does not contain %s", decodedQuery, substring), decodedQuery.contains(substring));
    }

    private static String toJsonMessages(Map<String, String> emailsWithErrors) throws JSONException {
        JSONObject result = new JSONObject();
        JSONArray array = new JSONArray();
        result.put("result", array);

        int emailCounter = 0;
        for (Map.Entry<String, String> emailWithError : emailsWithErrors.entrySet()) {
            JSONObject entry = new JSONObject();
            array.put(entry);

            entry.put("id", emailCounter++);
            entry.put("email", emailWithError.getKey());
            entry.put("error", emailWithError.getValue());
        }
        return result.toString();
    }

    private static <K, V> Map<K, V> createMap(K k1, V v1, K k2, V v2) {
        Map<K, V> map = new LinkedHashMap<K, V>();
        map.put(k1, v1);
        map.put(k2, v2);
        return map;
    }
}
