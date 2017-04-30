package com.talentech.inheritanceConcepts;

public class childClass3 extends baseClass{

	public static void main(String[] args) {
		
		//Scenario 3 - Base class reference and child class object - 
		//this will allow base class methods only and not child class methods

		baseClass obj1 = new childClass3();
		obj1.add();
		obj1.subs();

	}
	
	public void mul(){
		System.out.println("This is a child class and mul is 2500");
	}

	public void div(){
		System.out.println("This is a child class and div is 50");
	}
}
