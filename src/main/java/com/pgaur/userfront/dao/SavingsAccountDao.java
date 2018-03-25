package com.pgaur.userfront.dao;

import org.springframework.data.repository.CrudRepository;

import com.pgaur.userfront.domain.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

	SavingsAccount findByAccountNumber (int accountNumber);
	
}