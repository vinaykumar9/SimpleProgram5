package com.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> arr = new ArrayList();
		
		arr.add(23);
		arr.add(5);

		arr.add(7);

		arr.add(8);
        arr.add(87);
		arr.add(2);
		arr.add(23);
		arr.add(4);
		arr.add(2);
		
		for(Integer i: arr){
			System.out.println(i);
		}

		
		
		
	HashMap<Integer,Integer> map = new HashMap();
		
	for(Integer i: arr){
		Integer count =map.get(i);
		
		if(count ==null){
			map.put(i, 1);
			
		}
		else{
			map.put(i, ++count);
		}
	}

	
	
 for(Entry<Integer,Integer> ele : map.entrySet()){
	 
	 
	 System.out.println("print one by one");
	 System.out.println("key value"+ele.getKey() +"values count is "+ele.getValue());

 }
	}

}
