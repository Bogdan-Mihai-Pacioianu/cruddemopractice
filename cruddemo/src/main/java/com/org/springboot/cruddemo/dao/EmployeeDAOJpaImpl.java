package com.org.springboot.cruddemo.dao;

import com.org.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    // define field dor entitymanager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll(){

    // create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
    // execute quert an get resursult list
        List<Employee> employess = theQuery.getResultList();
    // return the result
        return employess;
    }








}
