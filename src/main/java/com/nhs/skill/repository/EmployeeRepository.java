package com.nhs.skill.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhs.skill.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}

