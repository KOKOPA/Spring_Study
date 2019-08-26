package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	// Proxy 자동생성 AOP 적용  사례
	public static void main(String[] args) {
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");

		System.out.println("여학생 입장");
		Person w = (Person)beans.getBean("woman");
		w.classWork();
		System.out.println("--------------");
		System.out.println("남학생 입장");
		Person m = (Person)beans.getBean("man");
		m.classWork();
	}
}
