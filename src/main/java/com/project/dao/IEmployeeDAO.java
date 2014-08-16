package com.project.dao;

import java.util.List;

import com.project.vo.Employee;

public interface IEmployeeDAO {

	public void saveEmployee(Employee employee);

	public Employee findEmployeeById(String id);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(Employee employee);

	public List<Employee> findAllEmployees();

}
