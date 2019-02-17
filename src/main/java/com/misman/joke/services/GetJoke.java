package com.misman.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class GetJoke {

	private ChuckNorrisQuotes chuckNorrisQuotes;
	
	public GetJoke() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	public String getQuote() {
		return chuckNorrisQuotes.getRandomQuote();
	}
	
}
