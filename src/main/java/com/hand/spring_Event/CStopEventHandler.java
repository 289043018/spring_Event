package com.hand.spring_Event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent>{

	public void onApplicationEvent(ContextStoppedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("ContextStoppedEvent Received");
	}
		
}
