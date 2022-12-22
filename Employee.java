package com.excercises.bll;

public class Employee {
private int id;
private String firstName;
private String lastName;
private double salary;

/*public Employee(int id,String firstName,String lastName, double salary) {
	this.id=id;
	this.firstName=firstName;
	this.lastName=lastName;
	this.salary=salary;
}
*/

public Employee(int id, String firstName, String lastName, double salary) {
	this.id=id;
	this.firstName=firstName;
	this.lastName=lastName;
	this.salary=salary;
}

public int getId() {
	return id;
}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public String getName() {
	return firstName+" "+lastName;
}

public double getsalary(){
	return salary;
}

public void setSalary(double salary) {
	this.salary=salary;
}

public double getAnnualeSalary() {
	return salary*12;
}

public double raiseSalary(int percentage) {
	salary= salary+((salary*percentage)/100);
	return salary;
}

public String toString() {
	return "Id:"+ id +"\nName:"+firstName+" "+lastName+"\nSalary:"+salary;
}
}
