package com.org.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from spring container
Coach theCoach = context.getBean("myCoach",Coach.class);

Coach alphaCoach = context.getBean("myCoach",Coach.class);


// 1, task to check whether these beans are the same beans  ?

boolean result = (theCoach==alphaCoach);

System.out.println("Pointing to the same object = "+result);

System.out.println("Memory location of ="+theCoach);

System.out.println("Memory Location for alpha ="+alphaCoach);


context.close();
	}

}
