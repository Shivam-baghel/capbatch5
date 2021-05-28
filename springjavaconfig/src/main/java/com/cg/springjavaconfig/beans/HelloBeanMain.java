package com.cg.springjavaconfig.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.springjavaconfig.config.MyConfiguration;

public class HelloBeanMain {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		HelloBean bean = (HelloBean) context.getBean("msgBean");
		bean.sayHello();
	}

}
