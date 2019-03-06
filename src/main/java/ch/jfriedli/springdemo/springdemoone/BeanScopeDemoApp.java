package ch.jfriedli.springdemo.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the sam
		boolean result = (coach.equals(alphaCoach));
		
		System.out.println("It is '" + result + "' that the objects are the same!");
		System.out.println("Memory location for coach: " + coach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		
		context.close();
	}

}
