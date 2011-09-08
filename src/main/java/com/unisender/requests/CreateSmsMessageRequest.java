package com.unisender.requests;

import com.unisender.entities.MailList;
import com.unisender.entities.SmsMessage;

public class CreateSmsMessageRequest extends CreateMessageRequest {
	private SmsMessage smsMessage;

	public CreateSmsMessageRequest(SmsMessage smsMessage, MailList listId) {
		this.smsMessage = smsMessage;
		this.listId = listId;
	}

	public SmsMessage getSmsMessage() {
		return smsMessage;
	}

	public void setSmsMessage(SmsMessage smsMessage) {
		this.smsMessage = smsMessage;
	}
}
