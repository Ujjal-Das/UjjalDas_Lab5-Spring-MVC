package com.ujjal.employeemgmt.Employee.Management.controller;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ujjal.employeemgmt.Employee.Management.entity.Employee;
import com.ujjal.employeemgmt.Employee.Management.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	private EmployeeService employeeService;
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/list")
	public String findAllEmployees(Model model) {
		List<Employee> employee = employeeService.findAll();
		model.addAttribute("Employee", employee);
		return "employee-list";
	}
	

}