package com.pgaur.userfront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pgaur.userfront.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {
	
	List<PrimaryTransaction> findAll();
	
}
