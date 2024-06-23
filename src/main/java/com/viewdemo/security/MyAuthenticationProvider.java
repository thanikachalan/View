package com.viewdemo.security;

import java.io.Serializable;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class MyAuthenticationProvider implements AuthenticationProvider, Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public boolean supports(Class<? extends Object> authentication) {
        return true;
    }

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		return new Auth(null);
	}

    
}