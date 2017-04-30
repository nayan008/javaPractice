package com.talentech.inheritanceConcepts;

public class childClass4 extends baseClass{

	public static void main(String[] args) {
		
		//scenario 4 - Child class reference and base class object – 
		//Invalid scenario because child cannot hold parent


		//childClass4 obj1 = new baseClass(); //Invalid
		//obj1.add();
		//obj1.subs();

	}
	
	public void mul(){
		System.out.println("This is a child class and mul is 2500");
	}

	public void div(){
		System.out.println("This is a child class and div is 50");
	}
}
