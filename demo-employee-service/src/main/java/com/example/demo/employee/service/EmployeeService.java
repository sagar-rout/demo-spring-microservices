/**
 * 
 */
package com.example.demo.employee.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.employee.client.Department;
import com.example.demo.employee.client.DepartmentClient;
import com.example.demo.employee.dto.EmployeeDto;
import com.example.demo.employee.entity.Employee;
import com.example.demo.employee.repository.EmployeeRepository;

/**
 * @author Sagar Rout
 *
 */
@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	private final DepartmentClient departmentClient;

	public EmployeeService(EmployeeRepository employeeRepository, DepartmentClient client) {
		this.employeeRepository = employeeRepository;
		this.departmentClient = client;
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

	@Transactional(readOnly = true)
	public EmployeeDto getEmployeeWithDeparmentMeta(UUID employeeId) {
		Employee employee = get(employeeId);
		
		Department department = departmentClient.get(employee.getDepartmentId());
		
		return new EmployeeDto(employeeId, department.getName(), department.getSince(), employee.getName(),
				employee.getMobileNo());
	}
}
