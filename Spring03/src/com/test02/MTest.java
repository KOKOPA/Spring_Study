package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		BirthDto me = (BirthDto)factory.getBean("me");
		BirthDto left = (BirthDto)factory.getBean("left");
		BirthDto right = (BirthDto)factory.getBean("right");
		
		System.out.println(me);
		System.out.println(left);
		System.out.println(right);
	}
}
