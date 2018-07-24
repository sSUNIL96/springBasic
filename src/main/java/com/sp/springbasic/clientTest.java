package com.sp.springbasic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class clientTest { 
public static void main(String[] args) {

	//BeanFactory factor=new XmlBeanFactory(new FileSystemResource("spring.xml"));
	//student student=(student)factor.getBean("student");
	
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	
	student student=(student)context.getBean("student");
	student.d();
}
}
