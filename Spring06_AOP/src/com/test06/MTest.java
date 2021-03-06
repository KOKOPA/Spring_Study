package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test06.Person;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test06/beans.xml");
		
		System.out.println("여학생 입장");
		Person w = (Person)beans.getBean("woman");
		w.classWork();
		System.out.println("------------");
		System.out.println("남학생 입장");
		Person m = (Person)beans.getBean("man");
		m.classWork();
	}
}
