package com.jra.pma.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jra.pma.models.Role;
import com.jra.pma.models.User;
import com.jra.pma.models.UserRole;
import com.jra.pma.services.UserService;




@RestController
@RequestMapping("/user")
public class UserController  {
	 @Autowired
	    private UserService userService;
	    //Creating user
	    @PostMapping("/")
	    public User createUser(@RequestBody User user) throws Exception{

	        Set<UserRole> roles=new HashSet<>();
	        Role role =new Role();
	        role.setRoleId(45L);
	        role.setRoleName("Normal");

	        UserRole userRole = new UserRole();
	        userRole.setUser(user);
	        userRole.setRole(role);
	        roles.add(userRole);

	        return this.userService.CreateUser(user, roles);
	    }
	    
	    @GetMapping("/{username}")
	    public User getUser(@PathVariable("username") String username){
	        return this.userService.getUser(username);
	    }

	    //delete user by id
	    @DeleteMapping("/{userId}")
	    public void deleteUser(@PathVariable("userId") Long userId){
	        this.userService.deleteUser(userId);
	    }

	    //update api
}
