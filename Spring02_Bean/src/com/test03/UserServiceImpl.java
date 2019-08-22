package com.test03;

public class UserServiceImpl implements UserService {

	public UserServiceImpl() {
		System.out.println("userServiceImpl 생성!!");
	}
	
	@Override
	public void addUser(UserDto dto) {
		System.out.println("adUser 메서드 호출!");
	}

}
