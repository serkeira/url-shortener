package com.lucascerqueira.encurtaurl.service;

import com.lucascerqueira.encurtaurl.model.Url;

public interface UrlService {

	public String getEncodedUrl(String url);

	public Url getShortenedUrl(String url);

}
