package com.prudhvi.M10;

import java.util.Scanner;

public class BigPallindrome_In_String {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the string word Sir/Madam ");
	String s=scn.next().toLowerCase();
	String bigpallindrome="";
	for(int i=0;i<s.length()-1;i++) {
	    for(int j=i+1;j<s.length();j++) {
	    	if(ispallindrome(s,i,j)) {
	    		String temp=s.substring(i, j+1);
	    		if(temp.length()<bigpallindrome.length()) {
	    			bigpallindrome=temp;
	    		}
	    	}
	    }	
	}
	System.out.println(bigpallindrome);
	
}

static boolean ispallindrome(String s,int start,int end) {
	int i=start,j=end;
	while(i<j) {
		if(s.charAt(i)!=s.charAt(j)) return false;
		i++;
		j--;
	}
	return true;
}
}
