package com.prudhvi.pallindrome;

import java.util.Scanner;

public class ChckpllimusingMethod {
	public static void main(String[] args) {
		System.out.println("String :");
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		System.out.println(ispallindrome(s));
	}
	public static boolean ispallindrome(String s1) {
		char[] arr=s1.toLowerCase().toCharArray();
		int i=0,j=arr.length-1;
		while(i<j) {
			if(arr[i]!=arr[j]) return false;
			i++;
			j--;
		}
		return true;
		
	}

}
