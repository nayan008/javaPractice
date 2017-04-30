package com.talentech.inheritanceConcepts;

public class childClass2 extends baseClass{

	public static void main(String[] args) {
		
		//scenario 2 - Base class reference and base class object – 
		//this will allow only base class methods

		baseClass obj1 = new baseClass();
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
