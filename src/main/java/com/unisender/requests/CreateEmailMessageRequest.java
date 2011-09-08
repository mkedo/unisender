package com.unisender.requests;

import com.unisender.entities.EmailMessage;
import com.unisender.entities.MailList;

public class CreateEmailMessageRequest extends CreateMessageRequest {
	private EmailMessage emailMessage;

	public CreateEmailMessageRequest(EmailMessage emailMessage, MailList listId) {
		this.emailMessage = emailMessage;
		this.listId = listId;
	}

	public EmailMessage getEmailMessage() {
		return emailMessage;
	}

	public void setEmailMessage(EmailMessage emailMessage) {
		this.emailMessage = emailMessage;
	}	
}
