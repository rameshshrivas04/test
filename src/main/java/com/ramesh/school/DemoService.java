package com.ramesh.school;

import org.springframework.scheduling.annotation.Scheduled;

public class DemoService {

	 @Scheduled(cron="0/2 * * * * ?")
	    public void demoServiceMethod()
	    {
	        System.out.println("Method executed at every 5 seconds. Current time is :: ");
	    }
	
	
}
