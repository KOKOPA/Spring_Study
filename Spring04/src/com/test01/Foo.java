package com.test01;

import java.util.Date;

public class Foo {
	
	Bar bar;
	
	public Foo() {
		System.out.println("Foo() 객체 생성");
	}
	
	public Foo(Date date) {
		System.out.println("Foo(date) 객체 생성 : " + date);
	}
	
	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("setBar() 호출");
	}
}