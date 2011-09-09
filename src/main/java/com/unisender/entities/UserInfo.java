package com.unisender.entities;

public class UserInfo {
	private String login;
	private String master;
	private double balance;
	private String currency;
	private Integer emailsPaid;
	private Integer emailsUsed;
	private Integer periodEmailsPaid;
	private Integer periodEmailsUsed;
	private String emailPeriodStart;
	private String emailPeriodEnd;
	public UserInfo() {
	}
	public UserInfo(String login, String master, double balance,
			String currency, Integer emailsPaid, Integer emailsUsed,
			Integer periodEmailsPaid, Integer periodEmailsUsed,
			String emailPeriodStart, String emailPeriodEnd) {
		this.login = login;
		this.master = master;
		this.balance = balance;
		this.currency = currency;
		this.emailsPaid = emailsPaid;
		this.emailsUsed = emailsUsed;
		this.periodEmailsPaid = periodEmailsPaid;
		this.periodEmailsUsed = periodEmailsUsed;
		this.emailPeriodStart = emailPeriodStart;
		this.emailPeriodEnd = emailPeriodEnd;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Integer getEmailsPaid() {
		return emailsPaid;
	}
	public void setEmailsPaid(Integer emailsPaid) {
		this.emailsPaid = emailsPaid;
	}
	public Integer getEmailsUsed() {
		return emailsUsed;
	}
	public void setEmailsUsed(Integer emailsUsed) {
		this.emailsUsed = emailsUsed;
	}
	public Integer getPeriodEmailsPaid() {
		return periodEmailsPaid;
	}
	public void setPeriodEmailsPaid(Integer periodEmailsPaid) {
		this.periodEmailsPaid = periodEmailsPaid;
	}
	public Integer getPeriodEmailsUsed() {
		return periodEmailsUsed;
	}
	public void setPeriodEmailsUsed(Integer periodEmailsUsed) {
		this.periodEmailsUsed = periodEmailsUsed;
	}
	public String getEmailPeriodStart() {
		return emailPeriodStart;
	}
	public void setEmailPeriodStart(String emailPeriodStart) {
		this.emailPeriodStart = emailPeriodStart;
	}
	public String getEmailPeriodEnd() {
		return emailPeriodEnd;
	}
	public void setEmailPeriodEnd(String emailPeriodEnd) {
		this.emailPeriodEnd = emailPeriodEnd;
	}
}
