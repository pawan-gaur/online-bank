package com.pgaur.userfront.service;

import com.pgaur.userfront.domain.User;

public interface UserService {
	
	User findByUsername(String username);
	
	User findByEmail(String email);
	
	boolean checkUserExists(String username, String email);
	
	boolean checkUsernameExists(String email);
	
	boolean checkEmailExists(String email);
	
	void save(User user);
}
