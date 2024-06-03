package com.prudhvi.BasicsOfArrays;

import java.util.Scanner;

public class addingtheEleInArray {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number of elemets size");
		
		int n=scn.nextInt(); 	
		System.out.println("enter the number of elements");
		int n1=scn.nextInt();
		int sum=0;
		int count=0;
		
		int[] arr=new int[--n];
		for(int i=0; i<n; i++)  
		{  
		count++;
		//reading array elements from the user   
		arr[i]=scn.nextInt(); 
		sum+=arr[i];
		if(count>=n) {
			System.out.println(sum);
	  }
	}
  }
}
