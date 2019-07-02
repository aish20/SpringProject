package com.org.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// load the configuration file (Basically creating the spring container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from container
		// mention the bean id here which is mention in the myCoach
		Coach theCoach = context.getBean("the",Coach.class);
		
		//call methods on the bean 
		
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
