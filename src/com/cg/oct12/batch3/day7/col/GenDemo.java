package com.cg.oct12.batch3.day7.col;

import java.util.ArrayList;
import java.util.Iterator;

public class GenDemo {

	public static void main(String[] args) {

		ArrayList myMarks = new ArrayList();
//		ArrayList<String> myMarks = new ArrayList<String>();
		myMarks.add(10);
		myMarks.add(10.5);
		myMarks.add("abc");
		System.out.println(myMarks);
		Iterator it = myMarks.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	
		  
		  ArrayList<Integer> myMarks1 = new ArrayList<>(); myMarks1.add(10); //
		  myMarks1.add(10); // myMarks.add("abc"); myMarks.add(35);
		  System.out.println(myMarks1);
		 
		
	}

}
