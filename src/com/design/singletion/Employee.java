package com.design.singletion;

public class Employee {

	private static Employee employee;

	private Employee() {
	}

	public static synchronized Employee getEmployeeInstance() {
		/*
		 * if(employee==null) 
		 *    employee=new Employee(); 
		 * return employee;
		 */
		return employee == null ? new Employee() : employee;
		
		//Eriþmek için :
		//Employee employee=Employee.getEmployeeInstance();
	}
}
