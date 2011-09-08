package com.unisender.responses;

public class SendSmsResponse {
	private String currency;
	private double price;
	private String smsId;
	
	public SendSmsResponse(String currency, double price, String smsId) {
		this.currency = currency;
		this.price = price;
		this.smsId = smsId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSmsId() {
		return smsId;
	}

	public void setSmsId(String smsId) {
		this.smsId = smsId;
	}	
}
