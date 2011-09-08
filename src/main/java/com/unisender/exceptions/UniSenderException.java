package com.unisender.exceptions;

public class UniSenderException extends Exception {
	private static final long serialVersionUID = 1L;

	public UniSenderException() {
		super();
	}

	public UniSenderException(String message, Throwable cause) {
		super(message, cause);
	}

	public UniSenderException(String message) {
		super(message);
	}

	public UniSenderException(Throwable cause) {
		super(cause);
	}
	
	
	
}
