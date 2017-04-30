package com.talentech.interfaceConcepts;

public class orangeHRMmethods implements orangeHRMinterface, commonAppInterface{
	//Interface implements class must have all methods in the interface implemented
	//Interface implements class may have additional methods as well

	public static void main(String[] args) {
		//creating a new object for the class
		orangeHRMmethods e = new orangeHRMmethods();
		//object.method name
		e.addEmployees();
		
		//creating a new object for the class
		orangeHRMmethods j = new orangeHRMmethods();
		//invoke method for adding a new job title
		j.addJobTitles();
		
		//creating a new object for the class
		orangeHRMmethods h = new orangeHRMmethods();
		//invoke method for adding a new holiday
		h.addHolidays();	
		
		//interface reference with child object
		orangeHRMinterface hr = new orangeHRMmethods();
		hr.addJobTitles(); //runtime polymorphism
		
		//interface reference with child object
		commonAppInterface ca = new orangeHRMmethods();
		ca.login(); //run time polymorphism
		//ca.addJobTitles(); --- not allowed

	}// end of main

	@Override
	public void addJobTitles() {
		System.out.println("This method adds a Job Title");
		
	}//end of addJobTitles

	@Override
	public void addEmployees() {
		System.out.println("This method adds a new employee");
		
	}//end of addEmployees

	@Override
	public void addHolidays() {
		System.out.println("This method adds a new holiday");
		
	}//end of addHolidays

	@Override
	public void login() {
		System.out.println("login to app");
		
	}

	@Override
	public void logout() {
		System.out.println("logout to app");
		
	}

	@Override
	public void openApp() {
		System.out.println("open the app");
		
	}

	@Override
	public void closeApp() {
		System.out.println("close the app");
		
	}

}//end of class orangeHRMmethods
