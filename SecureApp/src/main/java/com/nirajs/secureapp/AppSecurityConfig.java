package com.nirajs.secureapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	@Bean//need object of UserDetailsService and want to a bean
	@Override
	public UserDetailsService userDetailsServiceBean() throws Exception {
		List<UserDetails> users=new ArrayList<>();
		 users.add(User.withDefaultPasswordEncoder().username("niraj").password("1234").roles("user").build());
		users.add(User.withDefaultPasswordEncoder().username("saatvik").password("1234").roles("admin").build());
		
		return new InMemoryUserDetailsManager(users);
	}
	
	
	

}
