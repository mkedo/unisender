package com.unisender.entities;

import java.util.List;

public class Person {
	private Integer id;
	private String email;
	private String phone;
	private List<Field> fields;

	public Person() {
	}

	public Person(Integer id) {
		this.id = id;
	}

	public Person(Integer id, String email) {
		this.id = id;
		this.email = email;
	}

	public Person(Integer id, String email, String phone) {
		this.id = id;
		this.email = email;
		this.phone = phone;
	}

	public Person(String email, String phone) {
		this.email = email;
		this.phone = phone;
	}

	public Person(String email, String phone, List<Field> fields) {
		this.email = email;
		this.phone = phone;
		this.fields = fields;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
}
