package com.unisender.requests;

import com.unisender.entities.User;

public class RegisterRequest {
	private User user;
	
	private Integer notify;
	private String extra;
	private String timezone;
	private String countryCode;
	private String currencyCode;
	private String ip;
	private ApiMode apiMode;
	public RegisterRequest(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getNotify() {
		return notify;
	}
	public void setNotify(Integer notify) {
		this.notify = notify;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public ApiMode getApiMode() {
		return apiMode;
	}
	public void setApiMode(ApiMode apiMode) {
		this.apiMode = apiMode;
	}
}
