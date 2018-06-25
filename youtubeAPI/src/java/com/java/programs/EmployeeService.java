/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.programs;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author raghavendhar.r
 */
public class EmployeeService implements InitializingBean, DisposableBean{

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public EmployeeService(){
		System.out.println("EmployeeService no-args constructor called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("EmployeeService Closing resources");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("EmployeeService initializing to dummy value");
		if(employee.getName() == null){
			employee.setName("Pankaj");
		}
	}
}