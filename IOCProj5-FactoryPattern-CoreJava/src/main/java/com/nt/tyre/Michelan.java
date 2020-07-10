package com.nt.tyre;

public class Michelan implements CarTyre {
       public Michelan() {
	   System.out.println("Michelan:0-param constructor");
	}
	@Override
	public String dimensions() {
		return "width:20;height:22;grip:10(Michelan)";
	}

}
