package com.jra.pma.services;

import java.util.Set;

import com.jra.pma.models.User;
import com.jra.pma.models.UserRole;

public interface UserService {
	
	
	public User CreateUser(User user,Set<UserRole> userRoles) throws Exception ;
	public User getUser(String username);
	 public void deleteUser(Long userId);

}
