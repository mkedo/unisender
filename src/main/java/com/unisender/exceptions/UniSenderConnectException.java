package com.unisender.exceptions;

public class UniSenderConnectException extends UniSenderException {
	private static final long serialVersionUID = 1L;

	public UniSenderConnectException() {
		super();
	}

	public UniSenderConnectException(String message, Throwable cause) {
		super(message, cause);
	}

	public UniSenderConnectException(String message) {
		super(message);
	}

	public UniSenderConnectException(Throwable cause) {
		super(cause);
	}
	
}
