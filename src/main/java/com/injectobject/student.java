package com.injectobject;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class student implements ApplicationContextAware,BeanNameAware {
	
	private List<address>points;
	private ApplicationContext contet=null;
	
	public List<address> getPoints() {
		return points;
	}

	public void setPoints(List<address> points) {
		this.points = points;
	}

	
	
	public void m1(){
		for(address add:points){
			System.out.println("A="+add.getAid()+",  "+add.getBid());
			System.out.println("B="+add.getAid()+", "+add.getBid());
			
			System.out.println("C="+add.getAid()+",  "+add.getBid());
			
		}
		
		System.out.println("this is injectobject");
		
		
		
		
		
	}

	private address add() {

		return null;
	}

	public void setApplicationContext(ApplicationContext contet) throws BeansException {
		this.contet=contet;
		
	}

	public void setBeanName(String beanName) {
		System.out.println("Bean Name--"+beanName);
		
	}

}
