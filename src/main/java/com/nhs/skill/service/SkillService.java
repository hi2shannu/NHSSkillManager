package com.nhs.skill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhs.skill.entity.Employee;
import com.nhs.skill.exception.ResourceNotFoundException;
import com.nhs.skill.repository.EmployeeRepository;

@Service
public class SkillService {

	@Autowired
	private EmployeeRepository empRepo;

	public Employee saveEmployee(Employee emp) {
		return empRepo.save(emp);
	}

	public Employee getEmployee(int empId) {
		return empRepo.findById(empId).orElseThrow(
				() -> new ResourceNotFoundException("Employee Details not found for Id " + empId));
	}

	public String deleteEmployee(int empId) {
		empRepo.deleteById(empId);
		return "employee deleted : " + empId;
	}

	public Employee updateEmployee(Employee emp) {
		Employee e = empRepo.findById(emp.getEmpId()).orElseThrow(
				() -> new ResourceNotFoundException("Employee Details not found for Id " + emp.getEmpId()));

		e.setEmpName(emp.getEmpName());
		e.setExperience(emp.getExperience());
		e.setAge(emp.getAge());
		e.setCity(emp.getCity());
		e.setEmpSkills(emp.getEmpSkills());
		return empRepo.save(e);
	}
}
