package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:application.properties"})
public class ApplicationConfig {
	
	@Value("${spring.rmq.host}")
    private String host;
	
    @Value("${spring.rmq.username}")
    private String username;
    
    @Value("${spring.rmq.password}")
    private String password;
	
	@Value("${spring.rmq.fanout.queue.name}")
	private String fanoutQueueName;

	@Value("${spring.rmq.topic.queue.name}")
	private String topicQueueName;
	
	@Value("${spring.rmq.fanout.exchange.name}")
	private String fanoutExchangeName;

	@Value("${spring.rmq.topic.exchange.name}")
	private String topicExchangeNamae;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFanoutQueueName() {
		return fanoutQueueName;
	}

	public void setFanoutQueueName(String fanoutQueueName) {
		this.fanoutQueueName = fanoutQueueName;
	}

	public String getTopicQueueName() {
		return topicQueueName;
	}

	public void setTopicQueueName(String topicQueueName) {
		this.topicQueueName = topicQueueName;
	}

	public String getFanoutExchangeName() {
		return fanoutExchangeName;
	}

	public void setFanoutExchangeName(String fanoutExchangeName) {
		this.fanoutExchangeName = fanoutExchangeName;
	}

	public String getTopicExchangeNamae() {
		return topicExchangeNamae;
	}

	public void setTopicExchangeNamae(String topicExchangeNamae) {
		this.topicExchangeNamae = topicExchangeNamae;
	}

}
