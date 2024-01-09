package com.ujjal.employeemgmt.Employee.Management.service;

import java.util.List;

import com.ujjal.employeemgmt.Employee.Management.entity.Employee;

public interface EmployeeService {
	public List<Employee>findAll();
	public Employee findById(int id);
	public void saveOrUpdate(Employee employee);
	public void deleteById(int id);
	

}
