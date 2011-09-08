package com.unisender.requests;

import com.unisender.entities.FieldData;

public class ImportContactsRequest {

	private FieldData fieldData;

	private Integer doubleOptin;
	private Integer overwriteTags;
	private Integer overwriteLists;

	public Integer getDoubleOptin() {
		return doubleOptin;
	}

	public void setDoubleOptin(Integer doubleOptin) {
		this.doubleOptin = doubleOptin;
	}

	public Integer getOverwriteTags() {
		return overwriteTags;
	}

	public void setOverwriteTags(Integer overwriteTags) {
		this.overwriteTags = overwriteTags;
	}

	public Integer getOverwriteLists() {
		return overwriteLists;
	}

	public void setOverwriteLists(Integer overwriteLists) {
		this.overwriteLists = overwriteLists;
	}

	public FieldData getFieldData() {
		return fieldData;
	}

	public void setFieldData(FieldData fieldData) {
		this.fieldData = fieldData;
	}

}
