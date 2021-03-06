package com.nt.car;

import com.nt.tyre.CarTyre;

public class SwiftCar implements SuzukiCar {

	private CarTyre tyre;
	public SwiftCar(CarTyre tyre) {
		this.tyre = tyre;
		System.out.println("SwiftCar:1-param Constructor");
	}
	@Override
	public String specifications() {
		return "EngineCC:: 1200cc -> fuelType: Diesel ->model: sedan ";
	}
	@Override
	public String drive() {
		return "driving   5+1 gear system Swift  car with tyres "+tyre.dimensions();
	}

}
