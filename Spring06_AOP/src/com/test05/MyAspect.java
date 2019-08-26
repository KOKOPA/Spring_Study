package com.test05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	public void myClass() {}
	
	@Before("")
	public void befoer() {
		System.out.println("출석 카드 찍는다.");
	}
	
	@After("")
	public void after() {
		System.out.println("집에 간다.");
	}
}
