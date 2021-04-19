package com.example.azuredeployment.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("config.test")
	private String configText;
	
	
	@GetMapping("/helloWorld")
	public ResponseEntity<List<String>> helloWorld() {
		List<String> result = Arrays.asList(configText, "test 222", "test 3 updated");
		result.add("test 4");
		result.add("test 5");
		return new ResponseEntity<List<String>>(result, HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<String>> helloWorld1() {
		List<String> result = Arrays.asList(configText, "test 21", "test 31 updated");
		result.add("test 00");
		result.add("test 01");
		return new ResponseEntity<List<String>>(result, HttpStatus.OK);
	}

}
