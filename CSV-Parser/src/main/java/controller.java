package com.availity.controller;

import com.availity.model.City;
import com.availity.service.ICityService;
import com.availity.util.CSVtoText;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEmployeeController {

    @Autowired
    IEmoployeeService employeeService;

    @RequestMapping(value = "/employees", produces = "text/csv")
    public void findEmployees(HttpServletResponse response) throws IOException {

        List<Employee> employees = (List<Employee>) employeeService.findAll();

        CSVtoText.writeEmployees(response.getWriter(), employees);
    }

    @RequestMapping(value = "/employees/{employeeId}", produces = "text/csv")
    public void findEmployee(@PathVariable String employeeID, HttpServletResponse response) throws IOException {

        Employee employee = employeeService.findById(employeeID);
        CSVtoText.writeEmployees(response.getWriter(), employee);
    }
}
