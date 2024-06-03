package com.prudhvi.Comparetomethod;

import java.util.Scanner;

public class T3 {

public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String s=scn.nextLine().toLowerCase();
System.out.println("enter   the line");
	String s2="";
	String[] a=s.split(" ");
	for(int i=a.length-1;i>=0;i--) {
		String temp=a[i];
		for(int j=temp.length()-1;j>=0;j--) {
			s2+=temp.charAt(j);
		}
		s2+=" ";
	}
	s2=s2.trim();
	System.out.println(s2);

}}
