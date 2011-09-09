package com.unisender.requests;

public class TransferMoneyRequest {
	private String sourceLogin;
	private String targetLogin;
	private String sum;
	private String currency;
	
	
	public TransferMoneyRequest(String sourceLogin, String targetLogin,
			String sum, String currency) {
		this.sourceLogin = sourceLogin;
		this.targetLogin = targetLogin;
		this.sum = sum;
		this.currency = currency;
	}


	public String getSourceLogin() {
		return sourceLogin;
	}


	public void setSourceLogin(String sourceLogin) {
		this.sourceLogin = sourceLogin;
	}


	public String getTargetLogin() {
		return targetLogin;
	}


	public void setTargetLogin(String targetLogin) {
		this.targetLogin = targetLogin;
	}


	public String getSum() {
		return sum;
	}


	public void setSum(String sum) {
		this.sum = sum;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
