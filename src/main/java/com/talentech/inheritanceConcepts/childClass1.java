package com.talentech.inheritanceConcepts;

public class childClass1 extends baseClass {

	public static void main(String[] args) {
		
		//Scenario 1 - Child class reference and child class object – 
		//this will allow to access all child class and base class methods

		childClass1 obj1 = new childClass1();
		obj1.add();
		obj1.subs();
		obj1.mul();
		obj1.div();
	}
	
	public void mul(){
		System.out.println("This is child class and mul is 2500");
	}

	public void div(){
		System.out.println("This is child class and div is 50");
	}
}
