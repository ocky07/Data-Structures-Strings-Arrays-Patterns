package com.prudhvi.Tester;

import java.util.Scanner;

public class A5 {
public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the character to check it! it is vowel or not ?");
		char c=scn.next().charAt(0);
		
		if(c=='a'|| c=='e'||c=='i' ||c=='o'||c=='u')System.out.println("The is a vowel character :"+c);
		else System.out.println("this an consolute character: "+c);
		}
}
