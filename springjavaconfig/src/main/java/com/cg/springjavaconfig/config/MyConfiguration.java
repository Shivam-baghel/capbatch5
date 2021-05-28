package com.cg.springjavaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.springjavaconfig.beans.HelloBean;

@Configuration
public class MyConfiguration {
	
	@Bean(name="msgBean")
	public HelloBean getHelloBean() {
		HelloBean bean = new HelloBean();
		bean.setMessage("Spring Framework is great");
		return bean;
	}
}
