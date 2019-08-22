package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/beans.xml");
		
//		Address hong = (Address)factory.getBean("hong");
//		Address lee = (Address)factory.getBean("lee");
//		Address kim = (Address)factory.getBean("kim");
//		System.out.println(hong);
//		System.out.println(lee);
//		System.out.println(kim);
		
		JobAddress jHong = factory.getBean("jHong", JobAddress.class);
		JobAddress jLee = factory.getBean("jLee", JobAddress.class);
		JobAddress jKim = factory.getBean("jKim", JobAddress.class);
		System.out.println(jHong);
		System.out.println(jLee);
		System.out.println(jKim);
	}
}
