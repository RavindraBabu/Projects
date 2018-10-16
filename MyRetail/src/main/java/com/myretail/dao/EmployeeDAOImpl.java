package com.myretail.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.myretail.entity.Employee;

public  class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	private Session getSession() {
		return (Session) sessionFactory.getCurrentSession();
	}

	@Override
	public Employee Create(Employee employee) {
		getSession().save(employee);
		getSession().flush();
		
		return employee;
	}

	@Override
	public void Update(Employee employee) {
		getSession().update(employee);
		getSession().flush();
		
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getById(int id) {
		Employee emp = (Employee)getSession().get(Employee.class, id);
		return emp;
	}
	
	

}
