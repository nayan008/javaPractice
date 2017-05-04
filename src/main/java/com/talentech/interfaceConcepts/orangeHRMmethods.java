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

	public void login() {
		// TODO Auto-generated method stub
		
	}

	public void logout() {
		// TODO Auto-generated method stub
		
	}

	public void openApp() {
		// TODO Auto-generated method stub
		
	}

	public void closeApp() {
		// TODO Auto-generated method stub
		
	}

	public void addJobTitles() {
		// TODO Auto-generated method stub
		
	}

	public void addEmployees() {
		// TODO Auto-generated method stub
		
	}

	public void addHolidays() {
		// TODO Auto-generated method stub
		
	}


}//end of class orangeHRMmethods
