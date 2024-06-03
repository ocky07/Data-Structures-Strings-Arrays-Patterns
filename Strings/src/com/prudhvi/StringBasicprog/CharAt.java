package com.prudhvi.StringBasicprog;


public class CharAt {
	public static void main(String[] args) {
		String s1="prithvi raj";
		char arr=s1.charAt(0); //at will cheack the char position
		
		for(int i=0;i<=arr.length();i++) {
			
			System.out.println(arr.charAt(i));  // can not invoke the primitive datatype 
		}
	}
	
}
