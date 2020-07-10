package com.nt.comp;

public final class Vehicle {
	private Engine engine;
    public Vehicle() {
		System.out.println("Vehicle::-param constructor");
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
		System.out.println("Vehicle.setEngine()");
	}
	public void journey(String start,String end) {
		engine.start();
		System.out.println("Vehicle started From "  +start+   "");
		System.out.println("Going on");
		engine.stop();
		System.out.println("Vehicle stopped to "  +end+   "");
		System.out.println("Journey Completed");
	}

}
