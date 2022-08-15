package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EventData;
import com.example.demo.producer.FanoutSender;

@RestController
@RequestMapping("/api")
public class RabbitMQProducerController {
	
	@Autowired
	private FanoutSender fanoutSender;
	
	@PostMapping("/fanout")
	public ResponseEntity<String> fanoutProduce(@RequestBody EventData eventData) {
		fanoutSender.send(eventData);
		return ResponseEntity.ok("Successfully sent");
	}

}
