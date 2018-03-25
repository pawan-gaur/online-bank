package com.pgaur.userfront.dao;

import org.springframework.data.repository.CrudRepository;

import com.pgaur.userfront.domain.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {
	
	PrimaryAccount findByAccountNumber (int accountNumber);
	
}
