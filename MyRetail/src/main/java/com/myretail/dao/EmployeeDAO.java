package com.myretail.dao;

import com.myretail.entity.Employee;

public interface EmployeeDAO {
	public Employee Create(Employee employee);
	public void Update(Employee employee);
	public void Delete(int id);
	public  Employee getById(int id);
		
	}

