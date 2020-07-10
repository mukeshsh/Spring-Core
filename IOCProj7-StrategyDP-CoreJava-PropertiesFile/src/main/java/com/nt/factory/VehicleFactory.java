package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.Engine;
import com.nt.comp.Vehicle;

public class VehicleFactory {

	private static Properties props;
	static {
		InputStream is=null;
		try {
			//Load properties file
			is=new FileInputStream("src/main/java/com/nt/commons/app.properties");
			props=new Properties();
			props.load(is);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Vehicle getInstance() throws Exception{
		Engine engg=null;
		Vehicle vehicle=null;
		//create dependent class dynamically
		engg=(Engine) Class.forName(props.getProperty("dependent.class")).newInstance();
		//create target class object dynamically
		vehicle= (Vehicle)Class.forName(props.getProperty("target.class")).newInstance();
		//set dependent class object to target class
		vehicle.setEngine(engg);
		return vehicle;
	}

}