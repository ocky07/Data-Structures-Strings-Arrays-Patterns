package com.prudhvi.Tester;

import java.util.Scanner;

public class A4 {
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enetr the sentence :");
	String s=scn.next();
	int count=0;
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c=='a'||c=='e'|| c=='i'||c=='o'|| c=='u') ++count;
	}
	System.out.println(count);
}
}
