package com.unisender.requests;

public class ValidateSenderRequest {
	private String email;
	
	private String login;

	public ValidateSenderRequest(String email) {
		this.email = email;
	}
	
	public ValidateSenderRequest(String email, String login) {
		this.email = email;
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
}
