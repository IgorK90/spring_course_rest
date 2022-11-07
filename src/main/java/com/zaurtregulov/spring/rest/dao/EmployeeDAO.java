package com.zaurtregulov.spring.rest.dao;

import com.zaurtregulov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    void deleteEmployee(Employee employee);
    void deleteEmployee(int id);
}
