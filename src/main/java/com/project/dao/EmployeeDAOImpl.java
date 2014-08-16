/**
 * 
 */
package com.project.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.vo.Employee;

/**
 * @author Akshit Kaushik
 *
 */
@Repository("employeeDAO")
public class EmployeeDAOImpl implements IEmployeeDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void saveEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
	}

	public Employee findEmployeeById(String id) {
		// TODO Auto-generated method stub
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	public void updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		
	}

	public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().delete(employee);
		
	}

	public List<Employee> findAllEmployees() {
		List<Employee> employeeList = (List<Employee>) sessionFactory.getCurrentSession().createQuery("from Employee").list();
		return employeeList;
	}

}
