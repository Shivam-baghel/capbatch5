package com.cg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcore.beans.CalculateArea;

public class CalculateAreaMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		
		CalculateArea calArea = (CalculateArea) context.getBean("areaBean");
		
		calArea.findArea();
	}

}
