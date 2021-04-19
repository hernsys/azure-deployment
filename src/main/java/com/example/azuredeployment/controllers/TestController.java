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
		List<String> result = Arrays.asList(configText, "test 2", "test 3 updated");
		return new ResponseEntity<List<String>>(result, HttpStatus.OK);
	}

}
