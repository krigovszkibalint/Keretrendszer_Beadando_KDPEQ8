package com.kdpeq8.beadando.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.kdpeq8.beadando.repository.RoleRepository;
import com.kdpeq8.beadando.repository.UserRepository;

@Component
public class LoginController {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	
	@GetMapping("/login")
	public String Login() {
		return "login";
	}
	@GetMapping("/register")
	public String getRegister() {
		return "register";
	}
}
