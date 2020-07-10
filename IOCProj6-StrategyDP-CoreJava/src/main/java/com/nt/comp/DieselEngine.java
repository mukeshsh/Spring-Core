package com.nt.comp;

public final class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("DieselEngine::0-param constructor");
	}
	@Override
	public void start() {
		System.out.println("DieselEngine:: Engine Started");		
	}
	@Override
	public void stop() {
     System.out.println("DieselEngine::Engine Stopped");		
	}
}
