/**
 * 
 */
package com.example.demo.employee.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.employee.entity.Employee;
import com.example.demo.employee.repository.EmployeeRepository;

/**
 * @author Sagar Rout
 *
 */
@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Transactional
	public Employee create(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Transactional(readOnly = true)
	public Employee get(UUID employeeId) {
		return employeeRepository.findById(employeeId)
				.orElseThrow(() -> new NoDataFoundException(String.format("Employee %s not exist", employeeId)));
	}
}
