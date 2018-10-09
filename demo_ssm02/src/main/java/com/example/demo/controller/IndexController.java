package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AccountMapper;
import com.example.demo.domain.Account;

@RestController
public class IndexController {

	@Autowired
	AccountMapper am;
	
	@RequestMapping("/index")
	public Account getIndex() {
		return am.selectAccount(3);
	}
	
}
