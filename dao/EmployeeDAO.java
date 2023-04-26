package com.restcrud.demo.dao;

import com.restcrud.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int theId);
    Employee save(Employee theEmployee);

    void deleteById(int theId);










}
