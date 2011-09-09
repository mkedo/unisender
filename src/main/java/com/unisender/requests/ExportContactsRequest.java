package com.unisender.requests;

import java.util.List;

import com.unisender.entities.MailList;


public class ExportContactsRequest {
	private MailList listId;
	private List<String> fieldNames;

	private Integer offset;
	private Integer limit;
	
	public ExportContactsRequest() {
	}

	public ExportContactsRequest(MailList listId, List<String> fieldNames,
			Integer offset, Integer limit) {
		this.listId = listId;
		this.fieldNames = fieldNames;
		this.offset = offset;
		this.limit = limit;
	}
	
	public MailList getListId() {
		return listId;
	}


	public void setListId(MailList listId) {
		this.listId = listId;
	}


	public List<String> getFieldNames() {
		return fieldNames;
	}


	public void setFieldNames(List<String> fieldNames) {
		this.fieldNames = fieldNames;
	}


	public Integer getOffset() {
		return offset;
	}


	public void setOffset(Integer offset) {
		this.offset = offset;
	}


	public Integer getLimit() {
		return limit;
	}


	public void setLimit(Integer limit) {
		this.limit = limit;
	}	
}
