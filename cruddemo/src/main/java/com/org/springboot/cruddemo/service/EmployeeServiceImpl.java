package com.org.springboot.cruddemo.service;
import java.util.List;
import com.org.springboot.cruddemo.entity.Employee;
import com.org.springboot.cruddemo.dao.EmployeeDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO emDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmDAO){
        emDAO = theEmDAO;
    }

    @Override
    public List<Employee> findAll(){
        return emDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return emDAO.findById(theId);
    }
    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return emDAO.save(theEmployee);
    }
    @Transactional
    @Override
    public void deleteById(int theId) {
        emDAO.deleteById(theId);
    }
}
