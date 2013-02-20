package com.unisender.entities;


public class EmailMessage extends Message {
	
	/* required */
	private String senderName;
	private String senderEmail;
	private String subject;
	private String body;

	/* optional */

	private String attachments;
	private String lang;

    /* headers */

    private String replyTo;
    private String priority;

	public EmailMessage(String senderName, String senderEmail, String subject,
			String body) {
		super();
		this.senderName = senderName;
		this.senderEmail = senderEmail;
		this.subject = subject;
		this.body = body;
	}
	
	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAttachments() {
		return attachments;
	}

	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
