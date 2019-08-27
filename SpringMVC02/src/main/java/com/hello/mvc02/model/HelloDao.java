package com.hello.mvc02.model;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {

	public String getHello() {
		return "spring";
	}

}
