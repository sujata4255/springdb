package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="empid")
private int id;
	@Column(name="empname")
private String name;
	@Column(name="empsal")
private String sal;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the sal
 */
public String getSal() {
	return sal;
}
/**
 * @param sal the sal to set
 */
public void setSal(String sal) {
	this.sal = sal;
}

}
