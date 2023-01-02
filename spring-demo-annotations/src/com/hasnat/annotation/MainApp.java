package com.hasnat.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SportsConfig.class);
		
		PushupCoach theCoach = context.getBean("pushupCoach", PushupCoach.class);
		
		theCoach.getWorkout();
		System.out.println(" By " + theCoach.coachName);
		
		context.close();
	}

}
