/**
 * 
 */
package com.project.service;

import java.util.List;

import com.project.vo.Employee;

/**
 * @author Akshit Kaushik
 * 
 */
public interface IEmployeeService {
	public void saveEmployee(Employee employee);

	public Employee findEmployeeById(String id);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(Employee employee);

	public List<Employee> findAllEmployees();
}
