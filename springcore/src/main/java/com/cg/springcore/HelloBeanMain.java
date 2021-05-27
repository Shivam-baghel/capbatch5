package com.cg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcore.beans.HelloBean;

public class HelloBeanMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		HelloBean helloBean = (HelloBean) context.getBean("msgbean");
		
		helloBean.sayHello();
		

	}

}
