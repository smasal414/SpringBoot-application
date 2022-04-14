package com.intelizign.springbootnew.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "role_Name")
	private String roleName;

	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Long id, String roleName, Employee employee) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.employee = employee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", employee=" + employee + "]";
	}

}
