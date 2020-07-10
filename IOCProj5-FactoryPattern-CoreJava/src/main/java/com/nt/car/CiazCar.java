package com.nt.car;

import com.nt.tyre.CarTyre;

public class CiazCar implements SuzukiCar {

	private CarTyre tyre;
	public CiazCar(CarTyre tyre) {
		this.tyre = tyre;
		System.out.println("CiazCar:1-param Constructor");
	}
	@Override
	public String specifications() {
		return "EngineCC:: 1700cc -> fuelType: Diesel ->model: sedan ";
	}
	@Override
	public String drive() {
		return "driving   5+1 gear system Ciaz  car with tyres "+tyre.dimensions();
	}

}
