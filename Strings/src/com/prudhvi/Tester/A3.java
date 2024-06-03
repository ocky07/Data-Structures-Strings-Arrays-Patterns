package com.prudhvi.Tester;

import java.util.Scanner;

// To print the String in the reverse order...
public class A3{
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("sir or madam please enter your name here (*-*): ");
	String s=scn.nextLine();
	for(int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
	}
}
}

// we should be assign the string last index of the character index value to first iteration... 