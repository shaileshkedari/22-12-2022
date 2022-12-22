package com.excercises.pll;

import com.excercises.bll.Employee;
public class TestEmployee {

	public static void main(String[] args) {
		Employee e=new Employee(2,"Rohan","Pagare",25000d);
		System.out.println(e.toString());

		e.setSalary(30000);
		System.out.println("After set salary:"+e.getsalary());
		System.out.println("Annual salary :"+e.getAnnualeSalary());
		System.out.println("Raised salary :"+e.raiseSalary(10));
		System.out.println("After raised annual salary :"+e.getAnnualeSalary());
	}

}
