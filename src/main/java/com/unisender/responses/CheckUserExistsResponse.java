package com.unisender.responses;

public class CheckUserExistsResponse {
	private Integer loginExists;
	private Integer emailExists;
	
	
	public CheckUserExistsResponse() {
	}


	public CheckUserExistsResponse(Integer loginExists, Integer emailExists) {
		this.loginExists = loginExists;
		this.emailExists = emailExists;
	}


	public Integer getLoginExists() {
		return loginExists;
	}


	public void setLoginExists(Integer loginExists) {
		this.loginExists = loginExists;
	}


	public Integer getEmailExists() {
		return emailExists;
	}


	public void setEmailExists(Integer emailExists) {
		this.emailExists = emailExists;
	}
	
}
