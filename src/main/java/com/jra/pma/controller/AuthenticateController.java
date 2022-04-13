package com.jra.pma.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jra.pma.models.User;

@RestController
public class AuthenticateController {

	
	
	/*@GetMapping("/cuurent-user")
	public User getCurrentUser(Principal principal) {
		return ((User) this.UserDetailsService.loadUserByUsername(principal.getClass()) );
	}*/
}
