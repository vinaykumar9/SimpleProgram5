package com.duplicate.programss;

public class DuplicateProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={22,3,7,22,1,70,6,3,7};
		
		System.out.println(arr.length);
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j] && i!=j){
					
					System.out.println("Duplicate elemets in an given array are"+arr[i]);
					
				}
			}
		}

	}

}
