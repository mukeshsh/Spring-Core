package com.nt.test;

import com.nt.car.SuzukiCar;
import com.nt.factory.SuzukiCarFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
      
		SuzukiCar car=null;
		car=SuzukiCarFactory.getInstance("balenocar", "mrf");
		System.out.println(car.specifications());
		System.out.println(car.drive());
		System.out.println("------------------------------------");
		car=SuzukiCarFactory.getInstance("ciazcar", "ceat");
		System.out.println(car.specifications());
		System.out.println(car.drive());
		System.out.println("------------------------------------");
		car=SuzukiCarFactory.getInstance("swift", "michelan");
		System.out.println(car.specifications());
		System.out.println(car.drive());
	}

}
