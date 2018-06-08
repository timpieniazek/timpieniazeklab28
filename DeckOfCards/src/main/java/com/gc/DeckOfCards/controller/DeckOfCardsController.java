package com.gc.DeckOfCards.controller;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.gc.DeckOfCards.model.Deck;

@Controller
public class DeckOfCardsController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier())
				.build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		Deck deck = restTemplate.getForObject("https://deckofcardsapi.com/api/deck/new/shuffle", Deck.class);
		return new ModelAndView("index", "deck", deck);
	}
	
	//private String deck_id = "tz7txn5wtha1";

	private String deck_id = "tz7txn5wtha1";
	
	@RequestMapping("/drawfive")
	public ModelAndView index2() {
		
		CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier())
				.build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
//		restTemplate.getForObject("https://deckofcardsapi.com/api/deck/" + deck_id + "/shuffle/", Deck.class);
		Deck deck = restTemplate.getForObject("https://deckofcardsapi.com/api/deck/new/shuffle", Deck.class);
		
		String eyeDee = deck.getDeck_id();

		
		Deck deck2 = restTemplate.getForObject("https://deckofcardsapi.com/api/deck/" + eyeDee + "/draw/?count=15", Deck.class);
		
		return new ModelAndView("index", "deck", deck2);
	}
	

}
