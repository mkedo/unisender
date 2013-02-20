package com.unisender.entities;

import java.util.List;

import com.unisender.requests.ContactType;

public class Contacts {
	private ContactType contactType = ContactType.EMAIL;
	private String contacts;
	private List<MailList> listsIds;

    private Integer invite;
    private String comment;
	
	public Contacts(ContactType contactType, String contact) {
		this(contactType, contact, null);
	}
	
	public Contacts(ContactType contactType, List<MailList> listsIds) {
		this(contactType, null, listsIds);
	}
	
	private Contacts(ContactType contactType, String contacts,
			List<MailList> listsIds) {
		if (contactType != ContactType.EMAIL)
			throw new IllegalArgumentException("Api-метод пока поддерживает только активацию email-адресов");
			
		this.contactType = contactType;
		this.contacts = contacts;
		this.listsIds = listsIds;
	}

	public Contacts(String contacts) {
		this.contacts = contacts;
	}

	public Contacts(List<MailList> listsIds) {
		super();
		this.listsIds = listsIds;
	}
	
	

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContact(String contacts) {
		this.contacts = contacts;
	}

	public List<MailList> getListsIds() {
		return listsIds;
	}

	public void setListsIds(List<MailList> listsIds) {
		this.listsIds = listsIds;
	}

    public Integer getInvite() {
        return invite;
    }

    public void setInvite(Integer invite) {
        this.invite = invite;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
