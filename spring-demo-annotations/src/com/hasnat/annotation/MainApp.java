package com.hasnat.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		
		theCoach.getWorkout();
		
		context.close();
	}

}
