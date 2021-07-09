package com.devsuperior.bds01.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.devsuperior.bds01.entities.Department;
import com.devsuperior.bds01.entities.Employee;

public class DepartmentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Long id;
	public String name;
	public List<EmployeeDTO> employees = new ArrayList<>();
	
	public DepartmentDTO() {
	}

	public DepartmentDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public DepartmentDTO(Department entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
	
	public DepartmentDTO(Department entity, Set<Employee> employees) {
		this(entity);
		employees.forEach(empl -> this.employees.add(new EmployeeDTO(empl)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

	

