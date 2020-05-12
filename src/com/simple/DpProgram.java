package com.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DpProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 ={1,3,5,77,33,4,3,98};
		  ArrayList<Integer> ae= new ArrayList(Arrays.asList(a1));
		  
		  System.out.println("print  mximum number in an array");
		  System.out.println(Collections.max(ae));
		  System.out.println(Collections.frequency(ae,3));
		  System.out.println("printing sorting");
		  
	}

}
