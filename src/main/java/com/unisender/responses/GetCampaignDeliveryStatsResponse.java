package com.unisender.responses;

import java.util.List;

public class GetCampaignDeliveryStatsResponse {
	private List<String> fields;
	private List<List<String>> data;
	
	public GetCampaignDeliveryStatsResponse(List<String> fields,
			List<List<String>> data) {
		this.fields = fields;
		this.data = data;
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public List<List<String>> getData() {
		return data;
	}

	public void setData(List<List<String>> data) {
		this.data = data;
	}
	
	
}
