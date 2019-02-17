package com.misman.joke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.misman.joke.services.GetJoke;

@Controller
public class JokesController {

	private GetJoke getJoke;
	
	public JokesController(GetJoke getJoke) {
		this.getJoke = getJoke;
	}

	@RequestMapping({"/",""})
	public String theJokes(Model model) {
		model.addAttribute("joke", getJoke.getQuote());
		return "chucknorris";
	}
	
}
