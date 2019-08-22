package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		UserDto dto = (UserDto)factory.getBean("user");
		UserService service = factory.getBean("service", UserServiceImpl.class);
		
		System.out.println(dto.getName());
		System.out.println(dto.getMyDate());
	}

}
