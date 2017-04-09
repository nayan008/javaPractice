package com.tt.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class workWithString {

	public static void main(String[] args) throws IOException {
		//System.out.println("Reverse string");		
		String str; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		 
		System.out.println("Enter a String: ");
		str = br.readLine();
		
		workWithString ws = new workWithString();
		ws.reverseEverything(str);

	}
	public void reverseEverything(String str){
		System.out.print("Here is the string given:");
		System.out.println(str);
		String reverseString = new StringBuffer(str).reverse().toString();
		System.out.print("Here is the string reversed:");
		System.out.println(reverseString);
		
	}//end of reverseEverything


}
