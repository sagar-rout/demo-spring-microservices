package com.example.demo.employee.client;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "DEPARTMENT-SERVICE")
public interface DepartmentClient {

	@RequestMapping(path = "/departments/{id}")
	public Department get(@PathVariable("id") UUID uuid);
}
