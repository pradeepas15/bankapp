package com.cg.bank.service;

import java.util.List;

import com.cg.bank.model.Account;

public interface IAccountService {
	
	public void save(Account account);
	public List<Account> findAll();
	
	

}
