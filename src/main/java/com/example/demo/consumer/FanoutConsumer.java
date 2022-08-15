package com.example.demo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.EventData;
import com.example.demo.processor.EventDataProcessor;
import com.google.gson.Gson;

@Component
public class FanoutConsumer implements RabbitListenerConfigurer {
	
	Logger log = LoggerFactory.getLogger(FanoutConsumer.class);
	
	@Autowired
	private EventDataProcessor eventProcessor;
	
	@Override
	public void configureRabbitListeners(RabbitListenerEndpointRegistrar registrar) {
	}

	@RabbitListener(queues = { "${spring.rmq.fanout.queue.name}" })
	public void receiveMessageFromFanout1(EventData event) {
		log.info("Received message in fanout Queue: {}", new Gson().toJson(event));
		eventProcessor.process(event);
		log.info("Processing completed successfully");
	}
}
