package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Url {
	
	private String originalUrl;
	
	@JsonProperty("result_url")
	private String resultUrl;
	
	private String error;

	public String getOriginalUrl() {
		return originalUrl;
	}

	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}

	public String getResultUrl() {
		return resultUrl;
	}

	public void setResultUrl(String resultUrl) {
		this.resultUrl = resultUrl;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Url(String originalUrl, String resultUrl, String error) {
		super();
		this.originalUrl = originalUrl;
		this.resultUrl = resultUrl;
		this.error = error;
	}
	
	public Url() {
		
	}
	
	
	

}
