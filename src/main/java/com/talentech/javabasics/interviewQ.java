package com.talentech.javabasics;

import java.util.ArrayList;
import java.util.List;

public class interviewQ {
	public void replaceDuplicate(){
		int x [] = {1,2,2,3,3,4,5,6,7,7,8,9};
		for (int i=0; i<x.length-1; i++){
			if (x[i]==x[i+1]){
				x[i]=0;		
				System.out.println(x[i]);
			}//end if		
		}//end for
	}//end replaceDuplicate
	
	public List<String> fizzBuzz(int[]x){
		String temp=" ";
		//int[] x = {3,5,9,15,16,4,2};
		List<String> fb = new ArrayList<String>();
		for (int i=0;i<x.length; i++){
			if (x[i]%3==0&&x[i]%5==0){
				temp = "FizzBuzz";
				fb.add(temp);
			}//end of if
			else if (x[i]%3==0){
				temp = "Buzz";
				fb.add(temp);
			}// end of else if
			else if (x[i]%5==0){
				temp = "Fizz";	
				fb.add(temp);
			}//end of else if
			else
			{
				temp = Integer.toString(x[i]);
				fb.add(temp);
			}
			//System.out.println(temp);
		}// end of for
		
		//System.out.println(fb);
		return fb;
		
		
	}// end divFiveThree
	
	public void swapWithoutThirdVariable(){
		int a = 5;
		int b = 3;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}//swapWithoutThirdVariable

}
