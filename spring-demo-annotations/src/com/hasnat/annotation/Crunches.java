package com.hasnat.annotation;

import org.springframework.stereotype.Component;

@Component
public class Crunches implements Workout {

	
	@Override
	public String getWorkout() {
		
		return "21 Crunches!";
	}
}
