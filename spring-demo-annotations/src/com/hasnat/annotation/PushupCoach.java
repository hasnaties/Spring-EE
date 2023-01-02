package com.hasnat.annotation;

import org.springframework.beans.factory.annotation.Value;

public class PushupCoach implements Coach {
	
	private Workout dailyWorkout;
	
	@Value("${foo.name}")
	public String coachName;
	
	PushupCoach(Workout theWorkout){
		
		this.dailyWorkout = theWorkout;
	}
	
	@Override
	public void getWorkout() {
		
		System.out.println(dailyWorkout.getWorkout());
	}

}
