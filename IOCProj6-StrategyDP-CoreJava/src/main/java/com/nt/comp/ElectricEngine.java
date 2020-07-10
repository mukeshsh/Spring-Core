package com.nt.comp;

public final class ElectricEngine implements Engine {
    public ElectricEngine() {
     System.out.println("ElectricEngine::0-param Constructor");
    }
	@Override
	public void start() {
		System.out.println("ElectricEngine::Engine Started");

	}

	@Override
	public void stop() {
		System.out.println("ElectricEngine::Engine Stopped");

	}

}
