package com.prudhvi.HowToCreateAStringObject;

public class A1 {
public static void main(String[] args) {
	String s="java!@#$";
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c>='!' && c<='}') {
			System.out.println(c);
			
		}
	}
}
}
