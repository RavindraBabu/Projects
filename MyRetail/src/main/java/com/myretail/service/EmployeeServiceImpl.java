 package com.myretail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myretail.dao.EmployeeDAO;
import com.myretail.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;

	@Override
	public Employee create(Employee employee) {
		return employeeDAO.Create(employee);
	}

	@Override
	public void Update(Employee employee) {
		employeeDAO.Update(employee);
		
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getById(int id) {
		return employeeDAO.getById(id);
	}

}
