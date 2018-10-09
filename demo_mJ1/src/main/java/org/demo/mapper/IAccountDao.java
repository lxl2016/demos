package org.demo.mapper;

import org.demo.po.Account;

public interface IAccountDao {
	public Account selectAccount(int id);
}
