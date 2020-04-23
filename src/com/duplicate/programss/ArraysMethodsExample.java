package com.duplicate.programss;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArraysMethodsExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1 -print an array 
		int[] intArray = { 1, 2, 3, 4, 5 };
	
		System.out.println(intArray);
		//[I@15db9742

		String arr= Arrays.toString(intArray);
		System.out.println(arr);
		// [1, 2, 3, 4, 5]

//2 Create an ArrayList from an array
		
		String[] stringArray = { "a", "b", "c", "d", "e" };
ArrayList<String> al =new ArrayList<String>(Arrays.asList(stringArray));
System.out.println(al);
		// [a, b, c, d, e]

//3-Check if an array contains a certain value

String[] ab ={"a","c","j","d"};

boolean res =Arrays.asList(ab).contains("c");
System.out.println("contains element"+res);


//4 -
/*
int [] array1 ={1,4,3,7,4};
int[] array2 ={22,33,77,88};
int[] combinedArray = Arrays.


*/
int[] intArray1 = { 1, 2, 3, 4, 5 };
int[] intArray2 = { 6, 7, 8, 9, 10 };
int[] combinedIntArray = ArrayUtils.addAll(intArray1, intArray2);

System.out.println("combined array is");
String cm =Arrays.toString(combinedIntArray);
System.out.println(cm);


	}

}
