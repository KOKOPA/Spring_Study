package com.hello.mvc02.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloBiz {

	@Autowired
	private HelloDao dao;
	
	public String getHello() {
		
		return dao.getHello();
	}
}
