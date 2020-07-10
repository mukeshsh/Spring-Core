package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.HelloBean;
import com.nt.scope.ThreadScope;

public class Test {

	public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("/com/nt/cfgs/applicationContext.xml");
     HelloBean hello=(HelloBean) context.getBean("helloBean");
     HelloBean hello1=(HelloBean) context.getBean("helloBean");
    // hello.setName("Mukesh");
     System.out.println("--------------------");
     System.out.println(hello.sayHello());
     System.out.println(hello1.sayHello());
     System.out.println("--------------------");
     System.out.println("Main Thread::"+hello);
     System.out.println("Main Thread::"+hello1);
     Runnable r=  new Runnable() {
		
		@Override
		public void run() {
       HelloBean hello2=(HelloBean) context.getBean("helloBean");
       HelloBean hello3=(HelloBean) context.getBean("helloBean");
       System.out.println("User Thread::"+hello2);
       System.out.println("User Thread::"+hello3);
		}
	};

	Thread t =new Thread(r);
	t.start();
		/*
		 * 
		 * System.out.println("-------------------"); ThreadScope
		 * threadScope=(ThreadScope) context.getBean("threadScope"); HelloBean
		 * helloBean=(HelloBean) threadScope.remove("helloBean");
		 * System.out.println("Removed     ::"+helloBean);
		 * System.out.println("-----------------------------------------"); HelloBean
		 * helloBean1=(HelloBean) context.getBean("helloBean");
		 * System.out.println(helloBean1);
		 */
    
	}

}
