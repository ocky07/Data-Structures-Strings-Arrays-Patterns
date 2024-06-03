package com.prudhvi.StringBasicprog;

import java.util.Scanner;

public class A7 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the String word Sir/Madam :\n('-')");
	String s=scn.next();
	System.out.println(isPallindrome(s));
	
}
public static boolean isPallindrome(String s) {
	char[] ch=s.toUpperCase().toCharArray();
	int i=0,j=ch.length-1;
	while(i<=j) {
		if(ch[i]!=ch[j]) return false;
		i++;
		j--;
	}
	return true;
}
}
