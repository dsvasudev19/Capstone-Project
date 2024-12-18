package com.project.authentication_service.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.project.authentication_service.entity.UserCredential;

public class CustomUserDetails implements UserDetails {
	

	private static final long serialVersionUID = 1L;
	UserCredential userCredential;
	
	public CustomUserDetails(UserCredential userFound) {
		this.userCredential=userFound;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return userCredential.getPassword();
	}

	@Override
	public String getUsername() {
		return userCredential.getUsername();
	}

}
