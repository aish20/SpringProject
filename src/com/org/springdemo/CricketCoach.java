package com.org.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fields for emailAddress and Team
	private String emailAddress;

	private String team;
	
	
	public CricketCoach() {
		System.out.println("CricketCoach : No arg constructor");
	
	}
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune() ;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach inside email add setter");
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		System.out.println("Cricket Coach inside team setter");
		this.team = team;
	}
	
	

}
