package com.prudhvi.pallindrome;

import java.util.Scanner;

public class CheckIsPallindrome {

	public static void main(String[] args) {
		System.out.println("enter the string :");
		Scanner sc=new Scanner(System.in);
		String intputstg=sc.next();
		char[] arr=intputstg.toLowerCase().toCharArray();
		int i=0,j=arr.length-1;
		for(int k=0;k<=j;k++) {
			if(arr[i]!=arr[j]) {
				System.out.println("false");
			
			if(arr[i]==arr[j]){
				i++;
				j--;
			       if(j>=0) {
					if(i==intputstg.length())
					System.out.println("true");
					}
					 
				}
		}
	}
}

}