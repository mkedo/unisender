package com.unisender;

public class DefaultConfig implements Config {
	private String apiKey = "";
	private String language = "ru";
	private boolean useHttps = false;
	private boolean isTestMode = true;

	public DefaultConfig(String apiKey) {
		super();
		this.apiKey = apiKey;
	}

	public DefaultConfig(String apiKey, String language) {
		super();
		this.apiKey = apiKey;
		this.language = language;
	}

	public DefaultConfig(String apiKey, String language, boolean useHttps) {
		super();
		this.apiKey = apiKey;
		this.language = language;
		this.useHttps = useHttps;
	}

	public DefaultConfig(String apiKey, String language, boolean useHttps,
			boolean isTestMode) {
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

	public boolean getUseHttps() {
		return useHttps;
	}

	public void setUseHttps(boolean useHttps) {
		this.useHttps = useHttps;
	}

	public boolean getIsTestMode() {
		return isTestMode;
	}

	public void setIsTestMode(boolean isTestMode) {
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
