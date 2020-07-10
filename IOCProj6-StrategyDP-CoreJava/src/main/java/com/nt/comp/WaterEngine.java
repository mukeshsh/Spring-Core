package com.nt.comp;

public final class WaterEngine implements Engine {

	public WaterEngine() {
		System.out.println("WaterEngine::0-param constructor");
	}
	@Override
	public void start() {
		System.out.println("WaterEngine:: Engine Started");		
	}
	@Override
	public void stop() {
     System.out.println("WaterEngine::Engine Stopped");		
	}
}
