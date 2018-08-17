package com.cg.organization.bootstrap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.organization.Organization;

public class BootStrap {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		
		Organization organization = (Organization) context.getBean("org");
		
		System.out.println(organization);
	}

}
