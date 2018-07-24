package com.injectobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class clienttest {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		
		student sudent=(student)context.getBean("sudent1");
		sudent.m1();
		
	}

}
