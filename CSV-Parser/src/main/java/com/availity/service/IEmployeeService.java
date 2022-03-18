package com.availity.service;

import com.availity.model.Employee;
import java.util.List;

public interface IEmployeeService {

    List<Employee> findAll();
    Employee findById(String id);
}