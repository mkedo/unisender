package com.unisender.requests;

import java.util.List;

import com.unisender.entities.MailList;

public class UnsubscribeRequest {
	private ContactType contactType = ContactType.EMAIL;
	private String contact;
	private List<MailList> listsIds;

	public UnsubscribeRequest(ContactType contactType, String contact) {
		this.contactType = contactType;
		this.contact = contact;
	}

	public UnsubscribeRequest(ContactType contactType, String contact,
			List<MailList> listsIds) {
		this.contactType = contactType;
		this.contact = contact;
		this.listsIds = listsIds;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public List<MailList> getListsIds() {
		return listsIds;
	}

	public void setListsIds(List<MailList> listsIds) {
		this.listsIds = listsIds;
	}
}
