package com.example.demo.model;

import lombok.Data;

@Data
public class Greeting {

	public Greeting(String id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	private String id;
	private String content;
}
