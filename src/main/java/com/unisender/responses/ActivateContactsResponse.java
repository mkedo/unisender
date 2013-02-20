package com.unisender.responses;

public class ActivateContactsResponse {
	private Integer activated;
	private Integer activationRequestId;

    private Integer campaignId;
    private String campaignStatus;

	public ActivateContactsResponse(Integer activated,
			Integer activationRequestId) {
		this.activated = activated;
		this.activationRequestId = activationRequestId;
	}

	public ActivateContactsResponse(Integer activated) {
		this.activated = activated;
	}

    public ActivateContactsResponse(Integer campaignId, String campaignStatus) {
        this.campaignId = campaignId;
        this.campaignStatus = campaignStatus;
    }

    public Integer getActivated() {
		return activated;
	}

	public void setActivated(Integer activated) {
		this.activated = activated;
	}

	public Integer getActivationRequestId() {
		return activationRequestId;
	}

	public void setActivationRequestId(Integer activationRequestId) {
		this.activationRequestId = activationRequestId;
	}

}
