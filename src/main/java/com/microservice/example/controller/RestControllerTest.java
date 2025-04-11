package com.microservice.example.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {

	public String test() {
		return "Hello World!";
	}
}
