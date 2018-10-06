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
		
		//Eri�mek i�in :
		//Employee employee=Employee.getEmployeeInstance();
	}
}
