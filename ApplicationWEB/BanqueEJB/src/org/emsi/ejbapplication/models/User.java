package org.emsi.ejbapplication.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @GeneratedValue
	@Id
	private Integer id;
	private String username;
	private String pass;
	private static final long serialVersionUID = 1L;
	

	public User(String username, String pass) {
		super();

		this.username = username;
		this.pass = pass;
	}

	public User() {
		super();
	}   
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", pass='" + pass + '\'' +
				'}';
	}
}
