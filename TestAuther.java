package com.excercises.pll;

import com.excercises.bll.Auther;
public class TestAuther {

	public static void main(String[] args) {
		
		Auther a=new Auther();
		
		Auther a1=new Auther("Dennis","Ritchie");
		System.out.println("Display the values of two paramertrized contructor object by using getters.:");
		System.out.println("First name of auther:"+a1.getFirstName());
		System.out.println("Last name of auther:"+a1.getLastName());
		
		System.out.println("\nDisplay the values of default contructor object by using getters.:");
		System.out.println("First name of auther:"+a.getFirstName());//output for default constructor is null
		System.out.println("Last name of auther:"+a.getLastName());//output for default constructor is null
		System.out.println("Book name of auther:"+a.getBookName());//output for default constructor is null
		
		System.out.println("\nDisplay the values of three paramertrized contructor object by using getters.:");
		Auther a3=new Auther("Narayana ","Murthy","A Better India: A Better World");
		System.out.println("Book details:\n"+a3.toString());
	}

}
