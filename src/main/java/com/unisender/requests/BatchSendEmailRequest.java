package com.unisender.requests;

import java.util.Map;

import com.unisender.entities.EmailMessage;
import com.unisender.entities.MailList;

/**
 * Batch request for 'sendEmail'.
 *
 * @author AYeremenok
 */
public class BatchSendEmailRequest {
    private final Map<String, EmailMessage> messagesByReceiverEmail;
    private final MailList mailList;
    private final String lang;
    private final Integer trackRead;
    private final Integer trackLinks;

    /**
     * Main constructor.
     *
     * @param messagesByReceiverEmail keys are receiver emails, values - messages for them
     * @param mailList mail list, where receivers belong to
     * @param lang language code
     * @param trackRead 1 - track when messages are read, 0 and null - don't
     * @param trackLinks 1 - track when links are followed, 0 and null - don't
     */
    public BatchSendEmailRequest(Map<String, EmailMessage> messagesByReceiverEmail,
                                 MailList mailList,
                                 String lang,
                                 Integer trackRead,
                                 Integer trackLinks) {
        this.messagesByReceiverEmail = messagesByReceiverEmail;
        this.mailList = mailList;
        this.lang = lang;
        this.trackRead = trackRead;
        this.trackLinks = trackLinks;
    }

    public Map<String, EmailMessage> getMessagesByReceiverEmail() {
        return messagesByReceiverEmail;
    }

    public MailList getMailList() {
        return mailList;
    }

    public String getLang() {
        return lang;
    }

    public Integer getTrackRead() {
        return trackRead;
    }

    public Integer getTrackLinks() {
        return trackLinks;
    }
}
