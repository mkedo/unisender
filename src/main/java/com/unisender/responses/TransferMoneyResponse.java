package com.unisender.responses;

public class TransferMoneyResponse {
	private double sourceOldBalance;
	private double sourceNewBalance;
	private String sourceCurrency;
	private double targetOldBalance;
	private double targetNewBalance;
	private String targetCurrency;
	
	
	
	public TransferMoneyResponse(double sourceOldBalance,
			double sourceNewBalance, String sourceCurrency,
			double targetOldBalance, double targetNewBalance,
			String targetCurrency) {
		this.sourceOldBalance = sourceOldBalance;
		this.sourceNewBalance = sourceNewBalance;
		this.sourceCurrency = sourceCurrency;
		this.targetOldBalance = targetOldBalance;
		this.targetNewBalance = targetNewBalance;
		this.targetCurrency = targetCurrency;
	}



	public double getSourceOldBalance() {
		return sourceOldBalance;
	}



	public void setSourceOldBalance(double sourceOldBalance) {
		this.sourceOldBalance = sourceOldBalance;
	}



	public double getSourceNewBalance() {
		return sourceNewBalance;
	}



	public void setSourceNewBalance(double sourceNewBalance) {
		this.sourceNewBalance = sourceNewBalance;
	}



	public String getSourceCurrency() {
		return sourceCurrency;
	}



	public void setSourceCurrency(String sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}



	public double getTargetOldBalance() {
		return targetOldBalance;
	}



	public void setTargetOldBalance(double targetOldBalance) {
		this.targetOldBalance = targetOldBalance;
	}



	public double getTargetNewBalance() {
		return targetNewBalance;
	}



	public void setTargetNewBalance(double targetNewBalance) {
		this.targetNewBalance = targetNewBalance;
	}



	public String getTargetCurrency() {
		return targetCurrency;
	}



	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}
}
