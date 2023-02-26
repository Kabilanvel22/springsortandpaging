package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Employee {

	@Id
	private Long id;

	private String name;

	private double phno;
    private String servicetype;	
    private String email;	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		public double getphno() {
		return phno;
	}

	public void setphno(double phno) {
		this.phno = phno;
	}

	public String getservicetype() {
		return servicetype;
	}

	public void setservicetype(String servicetype) {
		this.servicetype = servicetype;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phno=" + phno + ", servicetype=" + servicetype + ", email=" + email + "]";
	}

	

	
}