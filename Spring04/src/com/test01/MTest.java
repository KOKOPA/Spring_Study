package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		Bar bar = (Bar)beans.getBean("bar");
		bar.pr();
		
		Foo foo = (Foo)beans.getBean("foo");
		
		// date 객체를 생성
		// 먼저 Foo객체를 생성하는데 생성자는 파라미터 date 하나를 받는 생성자를 호출
		// 위에 생성자 호출을 바로호출하지않게
		// 만든 객체에서 setBar 메소드 호출
		
	}
}
