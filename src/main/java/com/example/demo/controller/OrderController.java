package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@GetMapping("/getOrder")
	public ResponseEntity<?> getOrders() {
		return ResponseEntity.ok( orderService.findAllOrders());
	}

	@GetMapping
	public ResponseEntity<?> sayHello(@RequestParam("name") String name) {
		return ResponseEntity.ok("Hello " + name);
	}
}
