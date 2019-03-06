package ch.jfriedli.springdemo.springdemoone;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// bean lifecycle init method
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Init method called");
	}
	
	//bean lifecycle destroy method
	
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach: Destroy method called");
	}



}










