package com.talentech.javabasics;

public class interviewQCall {

	public static void main(String[] args) {
		//passing array for FizzBuzz
		interviewQ iq = new interviewQ();
		int[] x = {3,5,9,15,16,4,27};
		System.out.println(iq.fizzBuzz(x));
		
		System.out.println("===============================");
		iq.replaceDuplicate();
		System.out.println("===============================");
		
		//call to swap values without third variable
		iq.swapWithoutThirdVariable();

	}

}
