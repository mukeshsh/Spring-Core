package com.nt.test;

class ThreadScope extends ThreadLocal<String>{
  @Override
protected String initialValue() {
	return "No Data is In this scope";
}
}
	class A{
		void m1() {
			System.out.println("m1(): Thread1 Scope :"+Thread1.threadScope.get());
			System.out.println("m1(): Thread2 Scope :"+Thread2.threadScope.get());
		}
		void m2() {
			System.out.println("m2(): Thread2 Scope:"+Thread2.threadScope.get());
			System.out.println("m2(): Thread1 Scope:"+Thread1.threadScope.get());
		}
	}
	 class Thread1 extends Thread{
		static	ThreadScope threadScope=new ThreadScope();
		A a;
		public Thread1(A a) {
			this.a=a;
		}
		public void run() {
			threadScope.set("AAA");
			a.m1();
		}
	 }
		class Thread2 extends Thread{
			static	ThreadScope threadScope=new ThreadScope();
			A a;
			public Thread2(A a) {
				this.a=a;
			}
			public void run() {
				threadScope.set("BBB");
				a.m2();
			}
		}
		public  class Test {

			public static void main(String[] args) {

				A a=new A();
				Thread th1=new Thread1(a);
				Thread th2=new Thread2(a);

				th1.start();
				th2.start();
			}

		}
