/**
 * 
 */
package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.IEmployeeDAO;
import com.project.vo.Employee;

/**
 * @author Akshit Kaushik
 * 
 */
@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDAO employeeDAO;

	@Transactional
	public void saveEmployee(Employee employee) {
		employeeDAO.saveEmployee(employee);
	}

	@Transactional
	public Employee findEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeDAO.findEmployeeById(id);
	}

	@Transactional
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.updateEmployee(employee);
	}

	@Transactional
	public void deleteEmployee(Employee employee) {
		employeeDAO.deleteEmployee(employee);

	}

	@Transactional
	public List<Employee> findAllEmployees() {
		return employeeDAO.findAllEmployees();
	}

}
