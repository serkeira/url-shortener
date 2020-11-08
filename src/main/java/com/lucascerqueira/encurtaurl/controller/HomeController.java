package com.lucascerqueira.encurtaurl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.lucascerqueira.encurtaurl.model.Url;
import com.lucascerqueira.encurtaurl.service.impl.UrlServiceImpl;

@Controller
public class HomeController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private UrlServiceImpl urlServiceImpl;

	@GetMapping("/")
	public String getHomePage(Model model) {

		model.addAttribute("url", new Url());

		return "shorten";

	}

	@GetMapping("/shorten")
	public String shorten(Model model) {

		model.addAttribute("url", new Url());

		return "shorten";
	}

	@PostMapping("/shorten")
	public String submitForm(@ModelAttribute Url url, Model model) {

		Url urlFinal = urlServiceImpl.getShortenedUrl(url.getOriginalUrl());

		System.out.println(urlFinal.getResultUrl());

		model.addAttribute("shorturl", urlFinal);

		return "shorten";
	}

	@GetMapping("/shortened")
	public String shortened(Model model) {

		model.addAttribute("url", new Url());

		return "shorten";
	}
}
