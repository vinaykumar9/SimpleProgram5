package com.collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListInterfaceDemo {

	public static void main(String[] args) {
		
		
		//List Interface:
		
		// 1.It is the child interface of collection.
		//2.If we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion order must be preserved, then we should go far list
		//3.we can differentiate duplicates by using index.
		//4 we can preserve insertion order by using index, hence index play very important role in interface
		
		//methods in list interface:
		
		//-
		
		
		
		
		List  a = new ArrayList();
		
		a.add(23);
		a.add(5);
		System.out.println(a);  //printing elements in array list
		a.add(2, 875);
		System.out.println(a);  //printing elements in array list
		
		System.out.println(a.indexOf(875));   // print index of particular element
		
		System.out.println(a.get(1));  ///printing element through index value.......
		
		System.out.println(a.contains(23));
		
		System.out.println("size of array list"+a.size());
		a.add(7);
		
	//	a.set(index, element); replacement of  specific element at particular index.....and
		
		// we can iterate loops in two ways
		
		//using for loop
		
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		
		//
		System.out.println("print using iterator");
		Iterator itr =a.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		
		//convert arraylist into array
		System.out.println("conversion of arraylist into array");
		Object[]  a2 =a.toArray();
		
		System.out.println(a);
		
		System.out.println("print maximum number in array list");
		
		
		System.out.println(Collections.max(a));
		System.out.println("print minimum number in array list");
		
		
		System.out.println(Collections.min(a));
		

		
		
		
			

	}

}
