package com.nt.test;

import com.nt.comp.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
     Vehicle vehicle=null;
     //get vehicle class object
     vehicle=VehicleFactory.getInstance("electric");
     //invoked the method
     vehicle.journey("Hyderabad","Varanasi");
	}

}
