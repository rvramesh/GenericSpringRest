package com.example.demo.model;

import java.util.HashSet;
//import lombok.Data;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

//@Data
@Entity
public class Department {
 
	 @Id
	 @GeneratedValue 
	 private int deptid;
	 private String deptname;
	 
	 @OneToOne
	 @JoinColumn(name="id",nullable=true)
//	 @JsonManagedReference
//	 @JsonIgnore
	 private Employee id;
	 
	 
	public int getDeptid() {
		return deptid;
	}


	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	

	public Employee getId() {
		return id;
	}

	public void setId(Employee id) {
		this.id = id;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
}
