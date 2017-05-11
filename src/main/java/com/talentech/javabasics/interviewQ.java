package com.talentech.javabasics;

public class interviewQ {
	private void replaceDuplicate(){
		
	}//end replaceDuplicate
	
	public void fizzBuzz(){
		String temp=" ";
		int[] x = {3,5,9,15,16,4,2};
		for (int i=0;i<x.length; i++){
			if (x[i]%3==0&&x[i]%5==0){
				temp = "FizzBuzz";
			}//end of if
			else if (x[i]%3==0){
				temp = "Buzz";
			}// end of else if
			else if (x[i]%5==0){
				temp = "Fizz";			
			}//end of else if
			else
			{
				temp = "None";
			}
			System.out.println(temp);
		}// end of for
		
		
	}// end divFiveThree
	
	public void swapWithoutThirdVariable(){
		int a = 5;
		int b = 3;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}//swapWithoutThirdVariable

}
