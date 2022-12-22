package com.excercises.bll;

public class Auther {

	private String firstName;
	private String lastName;
	private String bookName;
	
	public Auther() {
		
	}
	    public Auther(String firstName,String lastName)
		{
			this.firstName=firstName;
			this.lastName=lastName;
		}
		public Auther(String firstName,String lastName,String bookName)
		{
			this.firstName=firstName;
			this.lastName=lastName;
			this.bookName=bookName;
		}
		public void setFirstName (String firstName) {
			this.firstName=firstName;
		}
		public void setLastName (String lastName) {
			this.lastName=lastName;
		}

		public void setBookNames(String bookName) {
		this.bookName=bookName;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public String getBookName(){
		          return bookName;
		}
		
		public String toString() {
			return "Book auther name :"+firstName+" "+lastName+"\n Book name:"+bookName;
		}
	}

	


