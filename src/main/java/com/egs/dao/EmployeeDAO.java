package com.egs.dao;

import org.springframework.data.repository.CrudRepository;

import com.egs.bean.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

	//DAO File
}
