package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/annotation/spring-annotation.xml");

		Student s = context.getBean("student",Student.class);
		
		System.out.println(s);
		
        System.out.println(s.getAddress());
        
       
	}

}
