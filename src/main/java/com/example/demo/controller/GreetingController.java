package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Greeting;
import com.example.demo.model.Message;

@RestController
public class GreetingController {
	
	@PostMapping("/hi")
	Message  postHiMessage(@RequestBody Message message) {
		message.setContent(message.getContent()+" *");
		return message;
	}
	
	@GetMapping("/hi")
	Message getHiMessage(@RequestParam String id) {
		Message message = new Message(id,"dummy content");
		return message;
	}

}
