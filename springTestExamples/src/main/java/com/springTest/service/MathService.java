package com.springTest.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

	public String sayHello() {
		return "hello";
	}
	
	public String sayHello(String name) {
		return name.concat(" hello");
	}
}
