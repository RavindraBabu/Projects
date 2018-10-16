package com.myretail.service;

import com.myretail.entity.Employee;

public interface EmployeeService {
	public Employee create(Employee employee);

	public void Update(Employee employee);

	public void Delete(int id);
	
	public  Employee getById(int id);

}
