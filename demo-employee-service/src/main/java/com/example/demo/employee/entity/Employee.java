/**
 * 
 */
package com.example.demo.employee.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sagar Rout
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="employe_id")
	private UUID id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable=false)
	private String mobileNo;
}
