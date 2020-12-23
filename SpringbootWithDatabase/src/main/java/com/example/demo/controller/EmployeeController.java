package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class EmployeeController {
	@PostMapping("/saveEmployee")
public Employee saveRecord(@RequestBody Employee employee)
{
		return null;
}
}
