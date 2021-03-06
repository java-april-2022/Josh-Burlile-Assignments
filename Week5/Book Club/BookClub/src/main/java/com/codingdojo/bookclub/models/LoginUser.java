package com.codingdojo.bookclub.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
    
public class LoginUser {
    
    @NotBlank(message="Email is required.")
    @Email(message="Please enter a valid email!")
    private String email;
    
    @NotBlank(message="Password is required.")
    @Size(min=8, max=100, message="Password must be between 8 and 100 characters")
    private String password;
    
    public LoginUser() {}

 // Getters and setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
    
}