package com.prudhvi.linearserachalgorithmArray;

import java.util.Scanner;

public class D1 {
	static int i; 

	public static void main(String[] args) {
	
		int[] a= {1,2,3,4,5,6,2,3};
		int ele=3;
		linearsearch(a, ele);
		System.out.println("The index position of the array:\n"+i);
		
		
	}
	public static int linearsearch(int[] a,int e) {
		
	

		for( i=0 ;i<a.length;i++) {
			if(a[i]==e) return i;
	       
		}
	    return -1;
	}
}
