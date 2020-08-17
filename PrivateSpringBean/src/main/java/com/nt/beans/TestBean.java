package com.nt.beans;

public class TestBean {
	private int a,b;

	private TestBean() {
		System.out.println("TestBean::O-param Construcor");
	}

	private TestBean(int a, int b) {
		System.out.println("TestBean::1-paramm Constructor");
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "TestBean [a=" + a + ", b=" + b + "]";
	}
    //nested class
	private static class DemoBean {
		private int c;
		public DemoBean() {
   System.out.println("TestBean.DemoBean.DemoBean()");
		}
		public void setC(int c) {
			this.c = c;
		}
		@Override
		public String toString() {
			return "DemoBean [c=" + c + "]";
		}
	}
}
