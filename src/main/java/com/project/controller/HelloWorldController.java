/**
 * 
 */
package com.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.service.IEmployeeService;
import com.project.vo.Employee;

/**
 * @author Akshit Kaushik
 * 
 */
@Controller
public class HelloWorldController {

	@Autowired
	IEmployeeService employeeService;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView sayWelcome(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		ModelAndView model = new ModelAndView("hello");		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeService.findAllEmployees();
		model.addObject("nameField", name);
		model.addObject("empList", employeeList);
		return model;
	}
	
}
