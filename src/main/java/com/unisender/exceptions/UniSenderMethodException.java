package com.unisender.exceptions;

public class UniSenderMethodException extends UniSenderException {
	private static final long serialVersionUID = 1L;
	
	private MethodExceptionCode methodExceptionCode;

	public UniSenderMethodException(MethodExceptionCode exceptionCode) {
		super();
		this.methodExceptionCode = exceptionCode;
	}

	public UniSenderMethodException(MethodExceptionCode exceptionCode, String message) {
		super(message);
		this.methodExceptionCode = exceptionCode;
	}

	public MethodExceptionCode getCode() {
		return methodExceptionCode;
	}
	
}
