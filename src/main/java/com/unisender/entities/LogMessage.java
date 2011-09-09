package com.unisender.entities;

public class LogMessage {
	private Integer index;
	private String code;
	private String message;
	
	public LogMessage(Integer index, String code, String message) {
		this.index = index;
		this.code = code;
		this.message = message;
	}
	
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString(){
		return "index:" + this.index
			+ " code:" + this.code
			+ " message:" + this.message;
	}
}
