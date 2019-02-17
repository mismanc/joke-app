package com.misman.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class GetJoke implements JokeService {

	private ChuckNorrisQuotes chuckNorrisQuotes;
	
	public GetJoke() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
	
}
