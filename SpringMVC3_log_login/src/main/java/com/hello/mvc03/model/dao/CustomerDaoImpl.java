package com.hello.mvc03.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.mvc03.dto.CustomerDto;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<CustomerDto> selectList() {
		
		List<CustomerDto> list = new ArrayList<CustomerDto>();
		
		try {
			list = sqlSession.selectList(namespace + "selectList");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("SELECT LIST ERROR");
		}
		return list;
	}

	@Override
	public CustomerDto selectOne(String id) {
		
		CustomerDto dto = null;
		
		try {
			dto = sqlSession.selectOne(namespace + "selectOne", id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}

	@Override
	public int insert(CustomerDto dto) {
		
		int res = 0;
		
		try {
			res = sqlSession.insert(namespace + "insert", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public int update(CustomerDto dto) {
		
		int res = 0;
		
		try {
			res = sqlSession.update(namespace + "update", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public int delete(String id) {
		
		int res = 0;
		
		try {
			res = sqlSession.delete(namespace + "deleteOne", id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public CustomerDto login(String id, String pw) {
		CustomerDto dto = null;
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("pw", pw);
		
		try {
			dto = sqlSession.selectOne(namespace + "login", map);
		} catch (Exception e) {
			System.out.println("로그인 에러");
			e.printStackTrace();
		}
		
		return dto;
	}

}
