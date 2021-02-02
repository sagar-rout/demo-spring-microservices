/**
 * 
 */
package com.example.department.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.department.entity.Department;

/**
 * @author sagar
 *
 */
public interface DepartmentRepository extends JpaRepository<Department, UUID>{
}
