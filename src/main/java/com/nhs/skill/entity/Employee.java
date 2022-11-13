package com.nhs.skill.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "emp_id")
	@GeneratedValue
	private int empId;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "experience")
	private int experience;
	@Column(name = "age")
	private int age;
	@Column(name = "city")
	private String city;
	@OneToMany(targetEntity = Skill.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "empskill_fk", referencedColumnName = "emp_id")
	private List<Skill> empSkills;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, int experience, int age, String city, List<Skill> empSkills) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.experience = experience;
		this.age = age;
		this.city = city;
		this.empSkills = empSkills;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Skill> getEmpSkills() {
		return empSkills;
	}

	public void setEmpSkills(List<Skill> empSkills) {
		this.empSkills = empSkills;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", experience=" + experience + ", age=" + age
				+ ", city=" + city + ", empSkills=" + empSkills + "]";
	}

}
