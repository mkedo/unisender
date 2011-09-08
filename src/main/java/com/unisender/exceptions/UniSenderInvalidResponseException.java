package com.unisender.exceptions;

public class UniSenderInvalidResponseException extends UniSenderException {

	private static final long serialVersionUID = 1L;

	public UniSenderInvalidResponseException() {
		super();
	}

	public UniSenderInvalidResponseException(String message, Throwable cause) {
		super(message, cause);
	}

	public UniSenderInvalidResponseException(String message) {
		super(message);
	}

	public UniSenderInvalidResponseException(Throwable cause) {
		super(cause);
	}
	

}
