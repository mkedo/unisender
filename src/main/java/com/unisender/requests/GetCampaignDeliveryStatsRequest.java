package com.unisender.requests;

import com.unisender.entities.Campaign;

public class GetCampaignDeliveryStatsRequest {
	private Campaign campaign;
	
	private String changed_since;

	public GetCampaignDeliveryStatsRequest(Campaign campaign) {
		super();
		this.campaign = campaign;
	}

	public GetCampaignDeliveryStatsRequest(Campaign campaign,
			String changedSince) {
		this.campaign = campaign;
		changed_since = changedSince;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public String getChanged_since() {
		return changed_since;
	}

	public void setChanged_since(String changedSince) {
		changed_since = changedSince;
	}
}
