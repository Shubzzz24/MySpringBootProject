package com.example.firstdemowebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {


	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("shubham");
		boolean isValidPassword = password.equalsIgnoreCase("shubham123");
		
		return isValidUsername && isValidPassword;
	}
}
