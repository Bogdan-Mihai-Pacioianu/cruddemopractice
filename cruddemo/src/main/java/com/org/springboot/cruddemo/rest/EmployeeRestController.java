package com.org.springboot.cruddemo.rest;

import com.org.springboot.cruddemo.dao.EmployeeDAO;
import com.org.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeDAO empDao;

    // quick and dirty: inject employee dao (use constructor injection)

    public EmployeeRestController(EmployeeDAO theEmpDao){
        empDao = theEmpDao;
    }
    // expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return empDao.findAll();
    }





}
