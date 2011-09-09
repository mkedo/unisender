package com.unisender.requests;

public enum ApiMode {
	OFF, TEST, ON;

	@Override
	public String toString() {
		switch (this) {
		case TEST:
			return "test";
		case ON:
			return "on";
		default:
			return "";
		}
	}
}
