package com.duplicate.programss;

import java.util.HashSet;
import java.util.Set;

public class DuplicateProgram2 {

	/*public static void main(String[] args) {

}*/

	public static void main(String[] args) 
	{
		int[] array = {22,3,7,22,1,70,6,3,7};
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < array.length ; i++) 
		{
			//If same integer is already present then add method will return FALSE 
			if(set.add(array[i]) == false) 
			{
				System.out.println("Duplicate element found : " + array[i]);
			}
		}
	}
}