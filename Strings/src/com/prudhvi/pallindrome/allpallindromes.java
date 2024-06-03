package com.prudhvi.pallindrome;

import java.util.Scanner;

public class allpallindromes {

	public static void main(String[] args) {
	System.out.println("string :");
	Scanner scn=new Scanner(System.in);
	String s=scn.next().toLowerCase();
	
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			if(ispallindrome(s,i,j)) 
				System.out.println(s.substring(i,j+1));
			}
		}
	}
	public static boolean ispallindrome(String s,int start,int end) {
		int i=start ,j=end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
		
		i++;
		j--;
	}
	return true;

	} 
	}

