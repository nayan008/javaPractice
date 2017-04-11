package com.tt.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
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
	    List<String> fileContent = new ArrayList<String>();

	    try {

	        Scanner sc = new Scanner(file).useDelimiter("\\s*-\\s*|,");

	        while (sc.hasNextLine()) {
	            String i = sc.next();
	            fileContent.add(i); 
	           //System.out.println(i);
	        }//end of while
	        
		    String[] tempsArray = fileContent.toArray(new String[0]);

		    for (String s : tempsArray) {
		      System.out.println(s);
		    }// end of for
	        sc.close();
	    }// end of try 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }//end of catch
	   // System.out.println(fileContent);
	 }//end of method readFile

}//end of class
