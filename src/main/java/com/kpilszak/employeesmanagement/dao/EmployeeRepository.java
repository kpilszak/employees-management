package com.kpilszak.employeesmanagement.dao;

import com.kpilszak.employeesmanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { }
