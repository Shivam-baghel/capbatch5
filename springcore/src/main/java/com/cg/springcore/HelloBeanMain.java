package com.cg.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cg.springcore.beans.HelloBean;
import com.cg.springcore.beans.HelloBean2;

public class HelloBeanMain {

	public static void main(String[] args) {
		
		
//		ClassPathResource resource = new ClassPathResource("springcontext.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		HelloBean2 helloBean = (HelloBean2) factory.getBean("msgbean2");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		
		HelloBean2 helloBean1 = (HelloBean2) context.getBean("msgbean2");
		
		HelloBean2 helloBean2 = (HelloBean2) context.getBean("msgbean2");
		
		HelloBean2 helloBean3 = (HelloBean2) context.getBean("msgbean2");
		
		
		
		if(helloBean1 == helloBean2) {
			System.out.println("Both refer to the same bean");
		}
		else {
			System.out.println("Both refer to the different bean");
		}	
		
		
		context.close();

	}

}



