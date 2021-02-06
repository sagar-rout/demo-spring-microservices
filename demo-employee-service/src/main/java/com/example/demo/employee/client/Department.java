/**
 * 
 */
package com.example.demo.employee.client;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sagar
 *
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {

	@Id
	@GeneratedValue
	@Column(name= "department_id")
	private UUID id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private LocalDate since;
}
