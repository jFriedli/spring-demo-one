package ch.jfriedli.springdemo.springdemoone;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach contructed");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Set FortuneService on CricketCoach");
		this.fortuneService = fortuneService;
	}
	
	

}
