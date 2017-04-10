package com.tt.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class workWithFile {

	public static void main(String[] args) {
		System.out.println("This is to reading from a file");
		workWithFile wwf = new workWithFile();
		String filePath = "testData/weightWatcher.txt";
		wwf.doesFileExist(filePath);
		wwf.readFile(filePath);
	}//end of main
	
	public void doesFileExist(String filePath){
		System.out.println("Does File Exists?");
		
		File f = new File(filePath);
		if(f.exists() && !f.isDirectory()) { 
		    System.out.println("The File Exist");
		}//end if
		else{
			System.out.println("The file does not exist");
		}//end else
					
	}//end of doesFileExist
	
	public void readFile(String filePath){
		//filePath = "testData/weightWatcher.txt";
	    File file = new File(filePath);

	    try {

	        Scanner sc = new Scanner(file);

	        while (sc.hasNextLine()) {
	            String i = sc.next();
	            System.out.println(i);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }//end of catch
	 }//end of readFile

}//end of class
