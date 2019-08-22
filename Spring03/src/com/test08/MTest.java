package com.test08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test08/beans.xml");
		
		TV sam = (TV)beans.getBean("sam");
		sam.powerOn();
		sam.volumeUp();
		sam.volumeDown();
		sam.powerOff();
		
	}
}
