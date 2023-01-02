package com.hasnat.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:source.properties")
public class SportsConfig {

	@Bean
	public Workout pushup() {
		return new Pushup();
	}
	
	@Bean
	public Coach pushupCoach() {
		
		PushupCoach newCoach = new PushupCoach(pushup());
		return newCoach;
	}
}
