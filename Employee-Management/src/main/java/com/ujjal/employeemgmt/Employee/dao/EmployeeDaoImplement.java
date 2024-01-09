package com.ujjal.employeemgmt.Employee.dao;

import java.util.List;

import com.ujjal.employeemgmt.Employee.Management.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
public class EmployeeDaoImplement implements EmployeeDao {

	EntityManager entityManager;
	@Autowired
	public EmployeeDaoImplement(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Employee> findAll() {
	    EntityManager entityManager = this.entityManager;
	    Query query = entityManager.createQuery("from Employee");
	    List<Employee> employee = query.getResultList();
	    return employee;
	}


	@Override
	@Transactional
	public Employee findById(int id) {
	    EntityManager entityManager = this.entityManager;
	    Employee employee = entityManager.find(Employee.class, id);
	    return employee;
	}


	@Override
	@Transactional
	public void saveOrUpdate(Employee employee) {
	    EntityManager entityManager = this.entityManager;
	    entityManager.merge(employee);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
	    EntityManager entityManager = this.entityManager;
	    Employee employee = entityManager.find(Employee.class, id);
	    if (employee != null) {
	        entityManager.remove(employee);
	    }
	}

}
