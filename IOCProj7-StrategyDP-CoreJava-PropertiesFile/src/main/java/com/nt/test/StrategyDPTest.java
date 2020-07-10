package com.nt.test;

import com.nt.comp.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
     Vehicle vehicle=null;
    try {
    	vehicle=VehicleFactory.getInstance();
    	//invoked the method
    	vehicle.journey("Harayana", "Jaunpur");
    	System.out.println("-------------------------");
    	vehicle.journey("Hyderabad", "Varanasi");
    }
    catch(Exception e) {
    	System.out.println("Internal problem");
    	e.printStackTrace();
    }
	}

}
