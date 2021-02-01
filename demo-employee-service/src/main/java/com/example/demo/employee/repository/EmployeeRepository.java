/**
 * 
 */
package com.example.demo.employee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.employee.entity.Employee;

/**
 * @author Sagar Rout
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, UUID>{
}
