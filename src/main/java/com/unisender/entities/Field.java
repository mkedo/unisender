package com.unisender.entities;

public class Field {
	private String name;
	private String value;
	private FieldType fieldType = FieldType.STRING;
	
	public Field() {
	}

	public Field(String name, String value) {
		this.name = name;
		this.value = value;
	}
	

	public Field(String name, String value, FieldType fieldType) {
		this.name = name;
		this.value = value;
		this.fieldType = fieldType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public FieldType getFieldType() {
		return fieldType;
	}

	public void setFieldType(FieldType fieldType) {
		this.fieldType = fieldType;
	}

}
