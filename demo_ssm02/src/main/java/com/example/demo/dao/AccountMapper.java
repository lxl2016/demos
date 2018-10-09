package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Account;
@Mapper
@Repository
public interface AccountMapper {
	public Account selectAccount(int id);
}
