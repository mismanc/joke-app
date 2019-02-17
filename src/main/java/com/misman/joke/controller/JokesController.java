package com.misman.joke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.misman.joke.services.JokeService;

@Controller
public class JokesController {

	private JokeService jokeService;
	
	public JokesController(JokeService getJoke) {
		this.jokeService = getJoke;
	}

	@RequestMapping({"/",""})
	public String theJokes(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "chucknorris";
	}
	
}
