package com.example.azuredeployment.controllers;

import java.util.ArrayList;
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
		List<String> result = new ArrayList<>();
		try {
			result = Arrays.asList(configText, "test 222", "test 3 updated");
		} catch (Exception e) {
			return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<String>> helloWorld1() {
		List<String> result = new ArrayList<>();
		try {
			result = Arrays.asList(configText, "test 000", "test 0003");
		} catch (Exception e) {
			return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
