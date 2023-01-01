package com.hasnat.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TrackCoach implements Coach {
	
	@Autowired
	private Workout dailyWorkout;
	
	@Override
	public void getWorkout() {
		
		System.out.println(dailyWorkout.getWorkout());
	}
	
	// At the start of Bean
	@PostConstruct
	public void atStart() {
		
		System.out.println("Bean is started!");
	}
	
	// When beat gets destroyed
	@PreDestroy
	public void atEnd() {
			
		System.out.println("Bean is ended!");
	}

}
