package com.unisender.requests;

import com.unisender.entities.MailList;

abstract class CreateMessageRequest {
	protected MailList listId;
	
	protected String tag;
	protected Integer seriesDay;
	protected String seriesTime;
	

	public MailList getListId() {
		return listId;
	}
	public void setListId(MailList listId) {
		this.listId = listId;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Integer getSeriesDay() {
		return seriesDay;
	}
	public void setSeriesDay(Integer seriesDay) {
		this.seriesDay = seriesDay;
	}
	public String getSeriesTime() {
		return seriesTime;
	}
	public void setSeriesTime(String seriesTime) {
		this.seriesTime = seriesTime;
	}	
}
