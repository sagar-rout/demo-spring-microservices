/**
 * 
 */
package com.example.department.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;

/**
 * @author sagar
 *
 */
@RestController
public class DepartmentController {

	private final DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@PostMapping(path = "/departments", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
	public Department create(@RequestBody Department department) {
		return departmentService.save(department);
	}

	@GetMapping(path = "/departments/{id}", produces = APPLICATION_JSON_VALUE)
	public Department get(@PathVariable("id") UUID id) {
		return departmentService.get(id);
	}
}
