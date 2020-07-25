package com.nt.beans;

public class Bike {
     private String regNo;
     private String owner;
     private String model;
     private String company;
     private String color;
     private int engineCC;
     private int fuelTankCapacity;
     private long engineNO;
	
	public Bike(String regNo, String owner, String model, String company, String color, int engineCC,
			int fuelTankCapacity, long engineNO) {
		System.out.println("Bike::0-param Constructor");
		this.regNo = regNo;
		this.owner = owner;
		this.model = model;
		this.company = company;
		this.color = color;
		this.engineCC = engineCC;
		this.fuelTankCapacity = fuelTankCapacity;
		this.engineNO = engineNO;
	}

	@Override
	public String toString() {
		return "Bike [regNo=" + regNo + ", owner=" + owner + ", model=" + model + ", company=" + company + ", color="
				+ color + ", engineCC=" + engineCC + ", fuelTankCapacity=" + fuelTankCapacity + ", engineNO=" + engineNO
				+ "]";
	}
     
     
}
