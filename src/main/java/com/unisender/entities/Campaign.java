package com.unisender.entities;

public class Campaign {
	protected Integer id;
	protected String status;
	protected Integer count;

	public Campaign() {
		super();
	}

	public Campaign(Integer id, String status, Integer count) {
		super();
		this.id = id;
		this.status = status;
		this.count = count;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
