package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	// annotation class 중복 제거한 AOP 예제
	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test05/beans.xml");
		
		System.out.println("여학생 입장");
		Person w = (Person)beans.getBean("woman");
		w.classWork();
		System.out.println("------------");
		System.out.println("남학생 입장");
		Person m = (Person)beans.getBean("man");
		m.classWork();
	}
}
