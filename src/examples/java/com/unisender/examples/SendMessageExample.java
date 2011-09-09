package com.unisender.examples;

import java.util.List;

import com.unisender.UniSender;
import com.unisender.entities.EmailMessage;
import com.unisender.entities.MailList;
import com.unisender.entities.SmsMessage;
import com.unisender.exceptions.UniSenderException;
import com.unisender.exceptions.UniSenderInvalidResponseException;
import com.unisender.exceptions.UniSenderMethodException;
import com.unisender.requests.CreateEmailMessageRequest;
import com.unisender.requests.CreateSmsMessageRequest;
import com.unisender.requests.SendEmailRequest;
import com.unisender.responses.SendEmailResponse;

public class SendMessageExample {
	
	public static final String apiKey = "<Your_API_Key>";
	
	public static void main(String[] args) throws UniSenderException {
		UniSender us = new UniSender(apiKey);
		try {
			/*  Создания e-mail сообщения без отправки
			 * http://www.unisender.com/ru/help/api/createEmailMessage */
			EmailMessage emailMessage = new EmailMessage("John Doe", "john@doe.con", "Subject", "Mail text");
			
			CreateEmailMessageRequest cr = new CreateEmailMessageRequest(emailMessage, new MailList(532791));
			cr.setSeriesDay(2); // optional
			us.createEmailMessage(cr);
			
			System.out.println("Email created:" + emailMessage.getId());
			
			
			/* Создание SMS-сообщения без отправки. 
			 * http://www.unisender.com/ru/help/api/createSmsMessage */
			SmsMessage smsMessage = new SmsMessage("<phone num or name>", "text");
			CreateSmsMessageRequest csr = new CreateSmsMessageRequest(
					smsMessage,
					new MailList(532791)
			);
			us.createSmsMessage(csr);
			
			System.out.println("Sms created:" + smsMessage.getId());
			
			/* Отправка одного или нескольких индивидуальных email-сообщений без использования персонализации 
			 * http://www.unisender.com/ru/help/api/sendEmail */
			SendEmailRequest ser = new SendEmailRequest("send@to.com", emailMessage, new MailList(532791));
			List<SendEmailResponse> serr = us.sendEmail(ser);
			for (SendEmailResponse resp: serr){
				System.out.println(resp);
			}
			
			/* Отправка одного SMS-сообщения одному адресату
			 * http://www.unisender.com/ru/help/api/sendSms */
			
			us.sendSms("79092020303", smsMessage);
			
			
			
		} catch (UniSenderMethodException e) {
			System.err.println(e.getCode());
			e.printStackTrace();
			
		} catch (UniSenderInvalidResponseException e) {
			System.err.println(e.getResponse());
			System.err.println(e);
		}
	}
}
