package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		Bar bar = (Bar)beans.getBean("bar");
		bar.pr();
		
	}
}
