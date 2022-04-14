package com.intelizign.springbootnew.services;

import java.util.List;
import java.util.Optional;

import com.intelizign.springbootnew.entity.Employee;

public interface EmployeeService {

	List<Employee> addNewListOfEmployee(List<Employee> employee);

	Optional<Employee> fetchById(long employeeId);
//	
//	public Employee save(Employee employee) {
//		
//		return null;
//	}
//	
//	public Employee assignRole(Role role, Long empId) {
//		
//		return null;
//	}

}
