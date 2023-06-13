package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient

@RestController
public class OrderServiceApplication {

	private Environment environment;

	public OrderServiceApplication(Environment environment) {
		super();
		this.environment = environment;
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@GetMapping
	public ResponseEntity<?> sayHello(@RequestParam("name") String name) {
		return ResponseEntity.ok("hello" + name);
	}

	@GetMapping("/status")
	public ResponseEntity<?> getPort() {
		return ResponseEntity
				.ok("Order Service up & running with port " + environment.getProperty("local.server.port"));
	}
}
