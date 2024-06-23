package com.viewdemo.security;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class Auth extends AbstractAuthenticationToken{

	public Auth(Collection<? extends GrantedAuthority> authorities) {
		super(authorities);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return "Test";
	}

	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return "";
	}

}
