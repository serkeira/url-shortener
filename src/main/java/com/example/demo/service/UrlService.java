package com.example.demo.service;

import com.example.demo.model.Url;

public interface UrlService {
	
	public String getEncodedUrl(String url);
	
	public Url getShortenedUrl(String url);

}
