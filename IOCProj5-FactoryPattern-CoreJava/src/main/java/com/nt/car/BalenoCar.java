package com.nt.car;

import com.nt.tyre.CarTyre;

public class BalenoCar implements SuzukiCar {

	private CarTyre tyre;
	public BalenoCar(CarTyre tyre) {
		this.tyre = tyre;
		System.out.println("BalenoCar:1-param Constructor");
	}
	@Override
	public String specifications() {
		return "EngineCC:: 1500cc -> fuelType: Diesel ->model: HatchBack ";
	}
	@Override
	public String drive() {
		return "driving   5+1 gear system Baleno  car with tyres "+tyre.dimensions();
	}

}
