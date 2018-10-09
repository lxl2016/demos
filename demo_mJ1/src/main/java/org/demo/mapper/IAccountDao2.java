package org.demo.mapper;

import org.apache.ibatis.annotations.Select;
import org.demo.po.Account;

public interface IAccountDao2 {
	@Select("select * from account where id = #{id} ")
	public Account selectById(int id);
	
}
