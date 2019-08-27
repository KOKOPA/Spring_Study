package com.test01;

public class Person implements Human {

	protected String name;
	protected String job;
	
	public Person() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String sayName(String name) {
		System.out.println("나의 이름은 " + name + " 입니다.");
		return "직업이 무엇입니까?";
	}

	@Override
	public String sayJob(String job) {
		return "나의 직업은 " + job + " 입니다.";
	}

}
