/**
 * 
 */
package com.example.demo.employee.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employee.dto.EmployeeDto;
import com.example.demo.employee.entity.Employee;
import com.example.demo.employee.service.EmployeeService;

/**
 * @author Sagar Rout
 *
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
	public Employee create(@RequestBody Employee employee) {
		return employeeService.create(employee);
	}

	@GetMapping(path = "/{employeeId}", produces = APPLICATION_JSON_VALUE)
	public Employee get(@PathVariable("employeeId") UUID employeeId) {
		return employeeService.get(employeeId);
	}
	
	// I know this naming style sucks but this is a leaning project, you know naming more difficult than leaning
	// Spring cloud :P
	@GetMapping(path = "/employees-department/{employeeId}", produces = APPLICATION_JSON_VALUE)
	public EmployeeDto getWithMetaInfo(@PathVariable("employeeId") UUID employeeId) {
		return employeeService.getEmployeeWithDeparmentMeta(employeeId);
	}
}
