package com.unisender.entities;

public class User {
	private String email;
	private String login;
	private String password;
	
	public User() {
	}
	public User(String email, String login) {
		this.email = email;
		this.login = login;
	}
	public User(String email, String login, String password) {
		this.email = email;
		this.login = login;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
