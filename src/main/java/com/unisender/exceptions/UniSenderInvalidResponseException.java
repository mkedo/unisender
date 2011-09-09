package com.unisender.exceptions;

public class UniSenderInvalidResponseException extends UniSenderException {

	private static final long serialVersionUID = 1L;
	private String response;

	public UniSenderInvalidResponseException() {
		super();
	}

	public UniSenderInvalidResponseException(String message, Throwable cause) {
		super(message, cause);
	}

	public UniSenderInvalidResponseException(String message) {
		super(message);
	}
	public UniSenderInvalidResponseException(String message, String response) {
		super(message);
		this.response = response;
	}

	public UniSenderInvalidResponseException(Throwable cause) {
		super(cause);
	}
	public UniSenderInvalidResponseException(Throwable cause,  String response) {
		super(cause);
		this.response = response;
	}

	public String getResponse() {
		return response;
	}
}
