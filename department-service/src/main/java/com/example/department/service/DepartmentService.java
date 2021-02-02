/**
 * 
 */
package com.example.department.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;

/**
 * @author sagar
 *
 */
@Service
public class DepartmentService {

	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	@Transactional
	public Department save(Department department) {
		return departmentRepository.save(department);
	}

	@Transactional(readOnly = true)
	public Department get(UUID id) {
		return departmentRepository.findById(id)
				.orElseThrow(() -> new NoDataFoundException(String.format("Department %s not found.", id)));
	}
}
