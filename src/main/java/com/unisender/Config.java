package com.unisender;

public interface Config {
	public String getApiKey();
	public String getLanguage();
	public boolean isTestMode();
	public boolean useHttps();
}
