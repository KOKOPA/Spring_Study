package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		
		Developer you = (Developer)factory.getBean("youD");
		Engineer kang = (Engineer)factory.getBean("kangE");
		
		System.out.println(you);
		System.out.println(kang);
	}
}
