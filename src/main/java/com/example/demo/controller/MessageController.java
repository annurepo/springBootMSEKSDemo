package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MessageController 
{
	
	private ResponseEntity<?> respentity=null;
	
	@GetMapping("/msg")
	public ResponseEntity<?> getMessage()
	{
		respentity = new ResponseEntity("Hello World", HttpStatus.OK);
		return respentity;
	}
}
