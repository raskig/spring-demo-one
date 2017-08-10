package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		// create context
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//create the object
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//use the object
		System.out.println(theCoach.gettDailyWorkout());
		
		//close context
		
		context.close();

	}

}
