package com.nt.listener;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MonitoringListener implements ApplicationListener {
   private long start,end;
   
   public MonitoringListener() {
   System.out.println("MonitoringListener::0-param Constructor");
   }
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {

		if(event.toString().indexOf("ContextRefreshedEvent")!=-1) {
			start=System.currentTimeMillis();
			System.out.println("IOC Container is started::"+new Date());
		}
		else if(event.toString().indexOf("ContextClosedEvent")!=-1) {
			end=System.currentTimeMillis();
			System.out.println("Ioc Container is closed/stopped::"+new Date());
			System.out.println("IOC conatiner active duration::"+(end-start)+"ms");
		}
	}

}
