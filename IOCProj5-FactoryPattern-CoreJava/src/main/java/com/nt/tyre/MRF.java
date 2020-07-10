package com.nt.tyre;

public class MRF implements CarTyre {
       public MRF() {
	   System.out.println("MRF:0-param constructor");
	}
	@Override
	public String dimensions() {
		return "width:20;height:22;grip:10(MRF)";
	}

}
