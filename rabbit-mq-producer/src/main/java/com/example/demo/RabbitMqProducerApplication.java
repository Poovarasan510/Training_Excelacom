package com.example.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;




@SpringBootApplication
public class RabbitMqProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqProducerApplication.class, args);
	}
	
	@Bean
	public AmqpTemplate template(ConnectionFactory factory)
	{
		return new RabbitTemplate(factory);
	}
	// after fanout
	@Bean
	public MessageConverter converter()
	{
		return new Jackson2JsonMessageConverter();
	}
	
	@Bean
	public AmqpTemplate templateWithConverter(ConnectionFactory factory)
	{
		
		RabbitTemplate rabbitTemplate = new RabbitTemplate(factory);
        rabbitTemplate.setMessageConverter(converter());

         return rabbitTemplate;
		
	}

}
