package com.nhs.skill.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nhs.skill.entity.Employee;
import com.nhs.skill.service.SkillService;

@RestController
public class SkillController {

	@Autowired
	private SkillService service;

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {

		return service.saveEmployee(employee);
	}

	@GetMapping("/employee/{empId}")
	public Employee getEmployee(@PathVariable int empId) {

		return service.getEmployee(empId);
	}

	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {

		return service.updateEmployee(employee);
	}

	@DeleteMapping("/employee/{empId}")
	public String DeleteEmployee(@PathVariable int empId)

	{
		return service.deleteEmployee(empId);
	}
}
