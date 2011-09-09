package com.unisender.entities;

public class Field {
	private Integer id;
	private String name;
	private String value;
	private FieldType fieldType = FieldType.STRING;
	private Integer isVisible;
	private Integer viewPos;

	public Field() {
	}

	public Field(Integer id) {
		this.id = id;
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
	

	public Field(Integer id, String name, String value, FieldType fieldType,
			Integer isVisible, Integer viewPos) {
		this.id = id;
		this.name = name;
		this.value = value;
		this.fieldType = fieldType;
		this.isVisible = isVisible;
		this.viewPos = viewPos;
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

	public Integer getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(Integer isVisible) {
		this.isVisible = isVisible;
	}

	public Integer getViewPos() {
		return viewPos;
	}

	public void setViewPos(Integer viewPos) {
		this.viewPos = viewPos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
