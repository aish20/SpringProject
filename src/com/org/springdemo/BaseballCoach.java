package com.org.springdemo;


// So we are basically helping the Coach classes to use the Fortune service and use the methods
public class BaseballCoach implements Coach{
	// define a private field and constructor
	private FortuneService fortuneservice;
	
	//define constructor for dependency injection
	 public BaseballCoach(FortuneService fortuneService) {
		fortuneservice = fortuneService;
		 
	}
	@Override
	public String getDailyWorkout()
	{
		return "Spend some time in baseball ground";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortune service to get a fortune
		
	return fortuneservice.getFortune();
	}

	//add an init method 
	
		public void doMyStartupStuff()
		{
			System.out.println("I am init");
		}
		
		
		//add a destroy method
		
		public void destroyMethod()
		
		{
			System.out.println("Destroy Method");
			
		}

	
	
}
