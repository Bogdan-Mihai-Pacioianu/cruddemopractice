package com.org.springboot.cruddemo.dao;

import com.org.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
