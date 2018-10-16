package com.myretail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myretail.entity.Employee;
import com.myretail.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody Employee create(@RequestBody Employee employee){
	
		return employeeService.create(employee);
	}

	public void Update(Employee employee){
		
	}

	public void Delete(int id){
		
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public  @ResponseBody Employee getById(@PathVariable int id){
		
		
		
		return employeeService.getById(id);
	}

}
