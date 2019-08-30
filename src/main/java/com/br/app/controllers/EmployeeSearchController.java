package com.br.app.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.br.app.models.Employee;
import com.br.app.services.EmployeeSearchService;

@Controller
public class EmployeeSearchController {

	@Autowired
	EmployeeSearchService employeeSearchService;

	@GetMapping("/employee/find/{id}")
	public Employee findById(@PathVariable Long id) {
		return employeeSearchService.findById(id);
	}

	@GetMapping("/employee/findall")
	public Collection<Employee> findAll() {
		return employeeSearchService.findAll();
	}
}
