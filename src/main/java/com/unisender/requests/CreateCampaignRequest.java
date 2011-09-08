package com.unisender.requests;

import java.util.List;

import com.unisender.entities.Message;

public class CreateCampaignRequest {
	private Message messageId;
	
	private String startTime;
	private String timezone;
	private Integer trackRead;
	private Integer trackLinks;
	/*
	 * Перечисленные через запятую email-адреса (или телефоны для sms-сообщений), 
	 * которыми нужно ограничиться при отправке сообщения. 
	 * Если этот аргумент отсутствует, то отправка будет осуществлена по 
	 * всем контактам списка, для которого составлено сообщение 
	 * (возможно, с учётом сегментации по меткам). 
	 * Если аргумент contacts присутствует, то во внимание будут приняты только
	 * те контакты, которые входят в список, а остальные будут проигнорированы.
	 * Те контакты, которые не являются активными и доступными,
	 * также будут проигнорированы.
	 */
	private List<String> contacts;
	private Integer defer;
	
	/* http://www.unisender.com/ru/help/ga_tracking */
	private Integer trackGa;
	private String gaMedium;
	private String gaSource;
	private String gaCampaign;
	private String gaContent;
	private String gaTerm;
	

	public CreateCampaignRequest(Message messageId) {
		this.messageId = messageId;
	}


	public Message getMessageId() {
		return messageId;
	}


	public void setMessageId(Message messageId) {
		this.messageId = messageId;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public String getTimezone() {
		return timezone;
	}


	public void setTimezone(String timezone) {
		this.timezone = timezone;
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


	public List<String> getContacts() {
		return contacts;
	}


	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}


	public Integer getDefer() {
		return defer;
	}


	public void setDefer(Integer defer) {
		this.defer = defer;
	}


	public Integer getTrackGa() {
		return trackGa;
	}


	public void setTrackGa(Integer trackGa) {
		this.trackGa = trackGa;
	}


	public String getGaMedium() {
		return gaMedium;
	}


	public void setGaMedium(String gaMedium) {
		this.gaMedium = gaMedium;
	}


	public String getGaSource() {
		return gaSource;
	}


	public void setGaSource(String gaSource) {
		this.gaSource = gaSource;
	}


	public String getGaCampaign() {
		return gaCampaign;
	}


	public void setGaCampaign(String gaCampaign) {
		this.gaCampaign = gaCampaign;
	}


	public String getGaContent() {
		return gaContent;
	}


	public void setGaContent(String gaContent) {
		this.gaContent = gaContent;
	}


	public String getGaTerm() {
		return gaTerm;
	}


	public void setGaTerm(String gaTerm) {
		this.gaTerm = gaTerm;
	}
}
