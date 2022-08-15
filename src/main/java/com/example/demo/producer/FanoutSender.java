package com.example.demo.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.config.ApplicationConfig;
import com.example.demo.model.EventData;

@Component
public class FanoutSender {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private ApplicationConfig applicationConfig;
	
	public void send(EventData eventData) {
		rabbitTemplate.convertAndSend(applicationConfig.getFanoutExchangeName(), "", eventData);
	}
}
