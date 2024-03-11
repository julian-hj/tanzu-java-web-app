package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
    throw new RuntimeException("Tramps like us, baby we weren't born to run");
		// return "Greetings + Ho Ho from 🎅🏿!";
	}

}
