package com.twb.blog.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.twb.blog.domain.User;

import java.util.Collection;
import java.util.Collections;

public class JwtUser implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;

	public JwtUser() {
	}

	public JwtUser(User user) {
		id = user.getId();
		username = user.getUsername();
		password = user.getPassword();
		authorities = Collections.singleton(new SimpleGrantedAuthority(user.getAuthrole()));
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String toString() {
		return "JwtUser{" + "id=" + id + ", username='" + username + '\'' + ", password='" + password + '\''
				+ ", authorities=" + authorities + '}';
	}

}
