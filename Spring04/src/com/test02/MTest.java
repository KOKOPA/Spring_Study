package com.test02;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		System.out.println("ㅡㅡㅡㅡㅡㅡ객체 생성 후ㅡㅡㅡㅡㅡㅡㅡ");
		MemberInfo obj = (MemberInfo)beans.getBean("member");
		int num = (int)(Math.random()*2);
		
		if(num == 0) {
			String message = beans.getMessage("title", null, "기본 메세지", Locale.getDefault());
			System.out.println(message);
			obj.display(Locale.getDefault());
		}else {
			String message = beans.getMessage("title", null, "default message", Locale.ENGLISH);
			System.out.println(message);
			obj.display(Locale.ENGLISH);
		}
	}
}
