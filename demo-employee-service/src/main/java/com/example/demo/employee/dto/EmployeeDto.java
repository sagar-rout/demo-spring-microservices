/**
 * 
 */
package com.example.demo.employee.dto;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sagar Rout
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private UUID id;
	private String departmentName;
	private LocalDate departmentSince;
	private String employeeName;
	private String mobileNo;
}
