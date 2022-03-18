package com.availity.service;

import com.availity.model.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<City> findAll() {

        return  (List<Employee>) repository.findAll();
    }

    @Override
    public Employee findById(String id) {

        return repository.findById(id).orElse(new Employee());
    }
}