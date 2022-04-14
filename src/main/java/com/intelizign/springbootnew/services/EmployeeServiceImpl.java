package com.intelizign.springbootnew.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelizign.springbootnew.Repositories.EmployeeRepository;
import com.intelizign.springbootnew.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> addNewListOfEmployee(List<Employee> employee) {

		return employeeRepository.saveAll(employee);
	}

	@Override
	public Optional<Employee> fetchById(long employeeId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(employeeId);
	}

}
