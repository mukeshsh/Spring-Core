package com.nt.factory;

import com.nt.comp.CNGEngine;
import com.nt.comp.DieselEngine;
import com.nt.comp.ElectricEngine;
import com.nt.comp.Engine;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Vehicle;
import com.nt.comp.WaterEngine;

public class VehicleFactory {
	
	public static Vehicle getInstance(String engineType) {
		Engine engg=null;
		Vehicle vhl=null;
		//create dependent class Object
		if(engineType.equalsIgnoreCase("diesel"))
			engg=new DieselEngine();
		else if(engineType.equalsIgnoreCase("petrol"))
			engg=new PetrolEngine();
		else if(engineType.equalsIgnoreCase("water"))
			engg=new WaterEngine();
		else if(engineType.equalsIgnoreCase("cng"))
			engg=new CNGEngine();
		else if(engineType.equalsIgnoreCase("electric"))
			engg=new ElectricEngine();
		else
			throw new IllegalArgumentException("Invalid Engine Type");
		
		//create target class object
		vhl=new Vehicle();
		vhl.setEngine(engg);
		return vhl;
	}

}
