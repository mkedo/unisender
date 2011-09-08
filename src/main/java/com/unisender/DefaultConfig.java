package com.unisender;

public class DefaultConfig implements Config {
	private String apiKey = "";
	private String language = "ru";
	private boolean useHttps = false;
	private boolean isTestMode = false;

	public DefaultConfig(String apiKey) {
		super();
		this.apiKey = apiKey;
	}

	public DefaultConfig(String apiKey, String language) {
		super();
		this.apiKey = apiKey;
		this.language = language;
	}

	public DefaultConfig(String apiKey, String language, Boolean useHttps) {
		super();
		this.apiKey = apiKey;
		this.language = language;
		this.useHttps = useHttps;
	}

	public DefaultConfig(String apiKey, String language, Boolean useHttps,
			Boolean isTestMode) {
		super();
		this.apiKey = apiKey;
		this.language = language;
		this.useHttps = useHttps;
		this.isTestMode = isTestMode;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Boolean getUseHttps() {
		return useHttps;
	}

	public void setUseHttps(Boolean useHttps) {
		this.useHttps = useHttps;
	}

	public Boolean getIsTestMode() {
		return isTestMode;
	}

	public void setIsTestMode(Boolean isTestMode) {
		this.isTestMode = isTestMode;
	}

	@Override
	public boolean isTestMode() {
		return this.isTestMode;
	}

	@Override
	public boolean useHttps() {
		return this.useHttps;
	}
}
