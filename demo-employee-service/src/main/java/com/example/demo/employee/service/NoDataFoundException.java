/**
 * 
 */
package com.example.demo.employee.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Sagar Rout
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoDataFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8015611366956470439L;

	public NoDataFoundException(String message) {
		super(message);
	}
}
