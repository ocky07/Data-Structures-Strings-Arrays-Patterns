package com.prudhvi.linearserachalgorithmArray;

import java.util.Scanner;

public class D2 {
	
	static int i;

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the only single digit numbers:: Don't give spaces");
		String s=scn.next();
		System.out.println("enter the finding element position:");
		int ele=scn.nextInt();
		char[] a=s.toCharArray();
		linearsearch(a, ele);
		System.out.println("The index position of the array:\n"+i);
		
	}
	public static int linearsearch(char[] a,int e) {
		
		

		for( i=0 ;i<a.length-1;i++) {
			if(a[i]==e) return i;
	       
		}
	    return -1;
	}

}
