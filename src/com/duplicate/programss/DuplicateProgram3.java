package com.duplicate.programss;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {22,3,7,22,1,70,6,3,7};
		
Object[] array20 = new Object[10];

array20[1] ="dTA";

Map<Integer,Integer>  map = new HashMap<Integer, Integer>();
 
 
 for(int i=0;i<array1.length;i++){
	 Integer count = map.get(array1[i]);
	 System.out.println("count value "+i);
	 System.out.println("array value "+array1[i]);

if(count==null){
		 
		 map.put(array1[i], 1);
		 System.out.println("ADDED INTO MAP");
		 
	 }
	 else{
		 map.put(array1[i], ++count);
	 }
	}
 
 Set<Entry<Integer,Integer>> sr = map.entrySet();
 for(Entry<Integer,Integer> ele:sr){
	 System.out.println("key "+ele.getKey()+"value is "+ele.getValue());
 }
 
 for(Entry<Integer,Integer> ele:sr){
	 if(ele.getValue()>1){
		 System.out.println("Duplicate element from array : " + ele.getKey());

 }


	}
}

	
	
	}

