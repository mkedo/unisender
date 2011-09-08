package com.unisender.entities;

public class SmsMessage extends Message{
	
	private String sender;
	private String body;

	public SmsMessage(String sender, String body) {
		this.sender = sender;
		this.body = body;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
