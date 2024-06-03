package com.prudhvi.StringBasicprog;

import java.util.Scanner;

public class CountVowelsInString {
public static void main(String[] args) {
	System.out.println("eneter the string :");
	Scanner scn=new Scanner(System.in);
	String s=scn.next().toLowerCase();
	int count=0;
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			count++;	
		}
	}
	System.out.println(count);
}
}
