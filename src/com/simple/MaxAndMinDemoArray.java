package com.simple;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class MaxAndMinDemoArray {

	public static void main(String[] args) {

		
		int[] array ={20,3,27,28,67,45,34};
		int i,j;
		
        /*     Arrays.sort(array);	
                
              for(int i:array){
            	  System.out.println(i);
              }
              
              
              System.out.println("second largest number in an given array is  "+array[array.length-2]);
              System.out.println("largest number in an given array is  "+array[array.length-1]);    
              System.out.println("smallest number in an given array is  "+array[0]);*/
		System.out.println(Arrays.binarySearch(array, 67));
		
	
		int temp;
		
		for( i  =0;i<array.length-1;i++){
			for( j= i+1; j<array.length;j++){
				
				if(array[i]>array[j]){
					
					temp =array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
		}
              
		for(i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
              

				
		}
	}

