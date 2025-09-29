package com.kpilszak.employeesmanagement.dao;

import com.kpilszak.employeesmanagement.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
