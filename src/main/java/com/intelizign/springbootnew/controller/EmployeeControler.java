package com.intelizign.springbootnew.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intelizign.springbootnew.entity.Employee;
import com.intelizign.springbootnew.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeControler {

//	@Autowired
//	private EmployeeService employeeService;

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public List<Employee> saveEmployee(@RequestBody List<Employee> employee) {
		return employeeService.addNewListOfEmployee(employee);
		// List<Employee> saveRecords =
		// this.employeeService.employeeRepository.saveAll(names);

		// return saveRecords;
	}

	@GetMapping("/{employeeId}")
	public Optional<Employee> fetchById(@PathVariable long employeeId) {
		return employeeService.fetchById(employeeId);

	}

//	@GetMapping("/{id}")
//	public Optional<Employee> findById(@PathVariable() Long id) {
//		Optional<Employee> fetch = this.employeeService.employeeRepository.findById(id);
//		return fetch;
//	}
//
//	@PostMapping("/update")
//	public Employee updateCourse(@RequestBody Employee course) {
//		Employee savedCourse = this.employeeService.employeeRepository.save(course);
//		if (savedCourse != null) {
//			return savedCourse;
//		}
//		return null;
//	}
//
//	@PostMapping("/assignRole/{empId}")
//	public Employee assignRole(Role role, @PathVariable("empId") Long empId) {
//
//		if (empId != null) {
//			Employee employee = this.employeeService.employeeRepository.getById(empId);
//			if (employee != null) {
//				employee.setRole(role);
//				return this.employeeService.employeeRepository.save(employee);
//			}
//		}
//
//		return null;
//	}
//
//	@PostMapping("/updateMultipleSkill")
//	public List<Employee> updateSkil(@RequestBody List<Employee> skill) {
//		for (Employee eachSkillName : skill) {
//			Optional<Employee> optional = this.employeeService.employeeRepository
//					.findById(eachSkillName.getEmployeeId());
//			if (optional.isPresent()) {
//				Employee emp = optional.get();
//				emp.setSkill(eachSkillName.getSkill());
//				this.employeeService.employeeRepository.save(emp);
//			}
//		}
//		return skill;
//	}
}