package ASSIGN;

import java.util.ArrayList;
import java.util.Collections;

public class RevArrayList {



	    public static void main(String[] args) 
	    {
	             
	        ArrayList<String> arrlist = new ArrayList<String>(); 
	 
	        //Adding elements to ArrayList object 
	        arrlist.add("Apple");         
	        arrlist.add("Amazon");        
	        arrlist.add("Facebook");
	        arrlist.add("Google");
	        arrlist.add("IBM");         
	        arrlist.add("Tesla");
	                 
	               
	        System.out.println("Before Reverse ArrayList:");         
	        System.out.println(arrlist);
	         
	                 
	        Collections.reverse(arrlist);
	         
	        //Displaying list after reverse         
	        System.out.println("After Reverse ArrayList:");         
	        System.out.println(arrlist);
	    }
	} 


