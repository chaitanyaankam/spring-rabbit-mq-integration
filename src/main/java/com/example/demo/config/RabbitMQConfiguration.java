package com.example.demo.config;

import java.net.URI;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

	@Autowired
	private ApplicationConfig applicationConfig;
	
	@Bean
    public Queue fanoutQueue() {
        return new Queue(applicationConfig.getFanoutQueueName(), false);
    }
	
    @Bean
    public FanoutExchange fanoutExcahnge() {
        return ExchangeBuilder.fanoutExchange(applicationConfig.getFanoutExchangeName()).durable(false).build();
    }
    
    @Bean
    public Binding binding() {
        return BindingBuilder
        		.bind(fanoutQueue())
                .to(fanoutExcahnge());
    }

	@Bean
	public ConnectionFactory connectionFactory() throws Exception {
		URI uri = new URI(applicationConfig.getHost());
		CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory(uri);
		cachingConnectionFactory.setUsername(applicationConfig.getUsername());
		cachingConnectionFactory.setPassword(applicationConfig.getPassword());
		return cachingConnectionFactory;
	}

	@Bean
	public MessageConverter jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	@Bean
	public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(jsonMessageConverter());
		return rabbitTemplate;
	}	
}
