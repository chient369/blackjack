package com.blackjack.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 25, nullable = false,unique = true)
	protected String userName;
	@Column(length = 40, nullable = false,unique = true)
	private String password;
	@Column(length = 20, nullable = false)
	protected int wallet;
	
	public User() {
		
	}
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		this.wallet = 1000;
	}

	public long getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getWallet() {
		return wallet;
	}
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	
	
	
}
