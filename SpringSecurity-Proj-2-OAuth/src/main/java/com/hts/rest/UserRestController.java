package com.hts.rest;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping("/home")
	public String showHome() {
		return "WELCOME TO ALL!!";
	}
	
	@GetMapping("/data")
	public String showData() {
		return "WELCOME TO DATA SECURED PAGE";
	}
	
	@GetMapping("/user")
	public Authentication getUserData(Principal p ) {
		System.out.println( "Current User name=>" + p.getName());
		System.out.println( "Impl class name=>" + p.getClass().getName());
		return SecurityContextHolder.getContext().getAuthentication();
	}
}