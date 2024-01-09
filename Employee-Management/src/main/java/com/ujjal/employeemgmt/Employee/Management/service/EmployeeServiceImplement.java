package com.ujjal.employeemgmt.Employee.Management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ujjal.employeemgmt.Employee.Management.entity.Employee;
import com.ujjal.employeemgmt.Employee.dao.EmployeeDao;
@Service
public class EmployeeServiceImplement implements EmployeeService {
	
	EmployeeDao employeeDao;

	@Autowired
	public EmployeeServiceImplement(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	public Employee findById(int id) {
		return employeeDao.findById(id);
	}

	@Override
	public void saveOrUpdate(Employee employee) {
		employeeDao.saveOrUpdate(employee);
	}

	@Override
	public void deleteById(int id) {
		employeeDao.deleteById(id);

	}

}
