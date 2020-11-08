package com.example.demo.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Url;
import com.example.demo.service.UrlService;

@Service
public class UrlServiceImpl implements UrlService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String getEncodedUrl(String url) {
		
		return null;
		
			
	}

	@Override
	public Url getShortenedUrl(String url) {
		
	
		String endpoint = "https://cleanuri.com/api/v1/shorten";
		
		MultiValueMap<String, String> parametersMap = new LinkedMultiValueMap<String, String>();
		parametersMap.add("url", url);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		Url response = restTemplate.postForObject(endpoint, parametersMap, Url.class);
		
		
		System.out.println(response);
		
		return response;
	}

}
