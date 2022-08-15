package com.example.demo.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.model.EventData;

@Component
public class EventDataProcessor {
	
	Logger log = LoggerFactory.getLogger(EventDataProcessor.class);
	
	public void process(EventData eventData) {
		log.info("Processing event data...");
	}
}
