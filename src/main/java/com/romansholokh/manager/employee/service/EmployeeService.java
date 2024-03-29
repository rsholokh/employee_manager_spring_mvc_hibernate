package com.romansholokh.manager.employee.service;

import com.romansholokh.manager.employee.entity.Employee;

import java.util.List;

public interface EmployeeService
{
    public List<Employee> getAllEmployees();

    public void saveOrUpdateEmployee(Employee employee);

    public Employee getEmployee(int employeeId);

    public void deleteEmployee(int employeeId);
}
