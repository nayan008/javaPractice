package com.tt.app;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List; 

public class FrontLineAssignment {
    public enum States { STARTING, TOKEN, BETWEEN }
    public static void main(String[] args)
    {
    	 String theString = 
         		"(id,created,employee(id,firstname,employeeType(id), lastname),location)";
        FrontLineAssignment theApp = new FrontLineAssignment();
        List<String> result = new ArrayList<String>();
        result = theApp.Answer( theString );
        
        System.out.println("=============================Printing the depth====================================");
        //Printing the depth
        for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
        System.out.println("=============================Printing the sorted result====================================");

        //sorting the collection
        Collections.sort(result);
        //Printing the Result after sorting
        for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
        
    }

    public  List<String>  Answer( String theString )
    {
       
        // wants:
        // ["content", "content1", "content2, content3", "content4", "content5", "content6, content7"]
        States state = States.STARTING;
        ArrayList<String> theStrings = new ArrayList<String>();
        StringBuffer temp = new StringBuffer("");

        for (int i = 0; i < theString.length() ; i++)
        {
            char cTemp = theString.charAt(i);
            switch (cTemp)
            {
                case '(':
                {
                    if (state == States.STARTING)  state = States.BETWEEN;
                    else if (state == States.BETWEEN)  {} 
                    else if (state == States.TOKEN )
                    {
                        state = States.BETWEEN;
                        theStrings.add(temp.toString().trim());
                        temp.delete(0,temp.length());
                    }
                    break;
                }
                case ')':
                {
                    if (state == States.STARTING) 
                    {  /* this is an error */ }
                    else if (state == States.TOKEN) 
                    {
                        theStrings.add(temp.toString().trim());
                        temp.delete(0,temp.length());
                        state = States.BETWEEN;
                    } 
                    else if (state == States.BETWEEN ) {}
                    break;
                }
                default:
                {
                    state = States.TOKEN;
                    temp.append(cTemp);
                }
            }
        }

        return PrintArrayList(theStrings);
    }
    public static  List<String>  PrintArrayList(ArrayList<String> theList)
    {    
 		List<String> theFinalList = new ArrayList<String>();
        for (int i = 0; i < theList.size(); i++)
        {
        	
        	System.out.println(i + ":" + theList.get(i));
        }
        for (int i = 0; i < theList.size()/2+1; i++)
        {
        	String prefix = "";
        	if (i ==0 ) 			
        		theFinalList.addAll(Arrays.asList(theList.get(i)));
        	else{
        	for (int j = 0; j < i; j++) {
        		prefix = prefix + "-";
			}
        	String[] tempArray = theList.get(i).split(",");
        	for (int j = 0; j < tempArray.length; j++) {
        		theFinalList.add(prefix + tempArray[j]);
			}
        	}
        }
        for (int i = theList.size()/2+1; i < theList.size(); i++)
        {
        	String prefix = "";
        	/*if (i ==0 ) 			
        		theFinalList.addAll(Arrays.asList(theList.get(i)));
        	else{*/
        	for (int j = i; j > i/2+1; j--) {
        		prefix = prefix + "-";
			}
        	String[] tempArray = theList.get(i).split(",");
        	for (int j = 0; j < tempArray.length; j++) {
        		if(tempArray[j].equals(" "))
        			continue;
        		if (i+1== theList.size()) {
        			theFinalList.add( tempArray[j]);
				}
        		else
        		theFinalList.add(prefix + tempArray[j]);
			}
//        	/}
        }
      
        String finalStr = theFinalList.toString();
        finalStr = finalStr.replaceAll(" , ", "");
        finalStr =  finalStr.replaceAll("-,", "");
        finalStr =  finalStr.replaceAll(" -, - ", "");
        finalStr =  finalStr.replaceAll(" ", "");
        finalStr =  finalStr.replaceAll("\\[", "");
        finalStr =  finalStr.replaceAll("\\]", "");
        List<String> theFinalResult = new ArrayList<String>();
        theFinalResult.addAll(Arrays.asList(finalStr.split(",")));
       // System.out.println("finalStr "+ finalStr);

       // System.out.println("theFinalResult : " + theFinalResult);
        return theFinalResult;
    }
}