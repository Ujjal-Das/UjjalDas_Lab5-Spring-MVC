package com.ujjal.employeemgmt.Employee.dao;

import java.util.List;

import com.ujjal.employeemgmt.Employee.Management.entity.*;

public interface EmployeeDao {
	public List<Employee>findAll();
	public Employee findById(int id);
	public void saveOrUpdate(Employee employee);
	public void deleteById(int id);
}
