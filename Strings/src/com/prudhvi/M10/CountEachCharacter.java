package com.prudhvi.M10;

import java.util.Scanner;

public class CountEachCharacter {
 

public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the word :");
	String s1=scn.next().toLowerCase();
	
	while(s1.length()>0) {
	char c=s1.charAt(0);
	String s2=s1.replace(c+"","");
	int count=s1.length()-s2.length();
	System.out.println(c+"="+count);
	s1=s2;
	}

}}
