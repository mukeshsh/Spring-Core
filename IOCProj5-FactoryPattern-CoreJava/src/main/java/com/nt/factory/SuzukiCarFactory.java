package com.nt.factory;

import com.nt.car.BalenoCar;
import com.nt.car.CiazCar;
import com.nt.car.SuzukiCar;
import com.nt.car.SwiftCar;
import com.nt.tyre.CEAT;
import com.nt.tyre.CarTyre;
import com.nt.tyre.MRF;
import com.nt.tyre.Michelan;

public class SuzukiCarFactory {
   //factory method
	public static SuzukiCar getInstance(String carType,String tyreType) {
		
		CarTyre tyre=null;
		SuzukiCar car=null;
		
		if(tyreType.equalsIgnoreCase("MRF"))
			tyre=new MRF();
		else if(tyreType.equalsIgnoreCase("ceat"))
			tyre=new  CEAT();
		else if(tyreType.equalsIgnoreCase("michelan"))
			tyre=new Michelan();
		else
			throw new IllegalArgumentException("Invalid Tyre Tyep::");
		
		if(carType.equalsIgnoreCase("BalenoCar"))
			car=new BalenoCar(tyre);
		else if(carType.equalsIgnoreCase("swift"))
			car=new SwiftCar(tyre);
		else if(carType.equalsIgnoreCase("Ciazcar"))
			car=new CiazCar(tyre);
		return car;
	}
	
}
