package com.unisender.requests;

import com.unisender.entities.EmailMessage;
import com.unisender.entities.MailList;

public class SendEmailRequest {
	private String email;
	private EmailMessage emailMessage;
	private MailList listId;
	
	private Integer trackRead;
	private Integer trackLinks;
	private Integer attachMulti;

    private String userCampaignId;
	
	public SendEmailRequest(String email, EmailMessage emailMessage,
			MailList listId) {
		this.email = email;
		this.emailMessage = emailMessage;
		this.listId = listId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmailMessage getEmailMessage() {
		return emailMessage;
	}

	public void setEmailMessage(EmailMessage emailMessage) {
		this.emailMessage = emailMessage;
	}

	public MailList getListId() {
		return listId;
	}

	public void setListId(MailList listId) {
		this.listId = listId;
	}

	public Integer getTrackRead() {
		return trackRead;
	}

	public void setTrackRead(Integer trackRead) {
		this.trackRead = trackRead;
	}

	public Integer getTrackLinks() {
		return trackLinks;
	}

	public void setTrackLinks(Integer trackLinks) {
		this.trackLinks = trackLinks;
	}

	public Integer getAttachMulti() {
		return attachMulti;
	}

	public void setAttachMulti(Integer attachMulti) {
		this.attachMulti = attachMulti;
	}

    /**
     * Optional attribute for grouping messages by.
     *
     * @return user campaign id
     */
    public String getUserCampaignId() {
        return userCampaignId;
    }

    public void setUserCampaignId(String userCampaignId) {
        this.userCampaignId = userCampaignId;
    }
}
