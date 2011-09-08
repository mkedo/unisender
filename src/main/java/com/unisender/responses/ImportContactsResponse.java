package com.unisender.responses;

import java.util.List;

import com.unisender.entities.LogMessage;

public class ImportContactsResponse {
	private int total;
	private int inserted;
	private int updated;
	private int deleted;
	private int newEmails;
	private List<LogMessage> logMessages;

	
	public ImportContactsResponse(int total, int inserted, int updated,
			int deleted, int newEmails) {
		this.total = total;
		this.inserted = inserted;
		this.updated = updated;
		this.deleted = deleted;
		this.newEmails = newEmails;
	}
	
	public ImportContactsResponse(int total, int inserted, int updated,
			int deleted, int newEmails, List<LogMessage> logMessages) {
		this.total = total;
		this.inserted = inserted;
		this.updated = updated;
		this.deleted = deleted;
		this.newEmails = newEmails;
		this.logMessages = logMessages;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getInserted() {
		return inserted;
	}
	public void setInserted(int inserted) {
		this.inserted = inserted;
	}
	public int getUpdated() {
		return updated;
	}
	public void setUpdated(int updated) {
		this.updated = updated;
	}
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	public int getNewEmails() {
		return newEmails;
	}
	public void setNewEmails(int newEmails) {
		this.newEmails = newEmails;
	}
	public List<LogMessage> getLogMessages() {
		return logMessages;
	}
	public void setLogMessages(List<LogMessage> logMessages) {
		this.logMessages = logMessages;
	}

}
