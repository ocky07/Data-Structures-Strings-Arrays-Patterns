package com.prudhvi.Tester;

public class A10 {
public static void main(String[] args) {
	String s="java is an oops lang";
	String[] a=s.split(" ");
	String s2="";
	for(int i=a.length-1;i>=0;i--) {
		String tem=a[i];
		for(int j=tem.length()-1;j>=0;j--) {
			s2+=tem.charAt(j);	
		}
		s2+=" ";
	}
	s2=s2.trim();
	System.out.println(s2);
	
}
}
