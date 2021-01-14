package com.nirajs.secureapp;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Users {
	
	@Id
	private Long id;
	private String username;
	private String password;

}
