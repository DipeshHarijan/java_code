package com.cts.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import com.cts.one.Greet;
import com.cts.one.GreetService;

public class DidApp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansOne.xml");
		GreetService gs = (GreetService) context.getBean("g1");
		System.out.println(gs.greet("Dipesh"));
		
		GreetService gs2 = (GreetService) context.getBean("g2");
		System.out.println(gs2.greet("Dipesh"));
	}
}
