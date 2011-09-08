package com.unisender.responses;

public class SendEmailResponse {
	private String email;
	private String id;
	private String error;
	
	public SendEmailResponse(String email, String id, String error) {
		super();
		this.email = email;
		this.id = id;
		this.error = error;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
}
