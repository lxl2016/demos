package org.demo.service.impl;

import org.demo.mappers.TestMapper01;
import org.demo.po.TableTest01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.demo.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService{
	@Autowired
	TestMapper01 tm01;
	@Override
	public String showMsg() {
		// TODO Auto-generated method stub
		return "Hello,This is in HelloService";
	}
	//@Transactional
	public String showName() {
		TableTest01 tt01 = tm01.selectTable01(2);
		return tt01.getName();
	}
	@Override
	public TableTest01 getTableTest01(int id) {
		// TODO Auto-generated method stub
		return tm01.selectTable01(id);
	}
	
}
