package com.kpilszak.employeesmanagement.service;

import com.kpilszak.employeesmanagement.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
