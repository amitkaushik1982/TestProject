/**
 * 
 */
package com.project.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.service.IEmployeeService;
import com.project.vo.Employee;

/**
 * @author Akshit Kaushik
 * 
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Employee employee = new Employee();
		employee.setId("1003");
		employee.setName("John");
		employee.setAddress("London");
		employee.setDesignation("Manager");
		IEmployeeService employeeService = (IEmployeeService) context
				.getBean("employeeService");

		/*
		 * employee = employeeService.findEmployeeById(employee.getId());
		 * System.out.println("Name : "+employee.getName()
		 * +", Address: "+employee.getAddress());
		 */

		employeeService.saveEmployee(employee);
		// employeeService.deleteEmployee(employee);
		// employeeService.updateEmployee(employee);
		System.out.println("Record updated");
		context.close();

	}

}
