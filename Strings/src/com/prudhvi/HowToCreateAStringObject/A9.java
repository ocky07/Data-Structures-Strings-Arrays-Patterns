package com.prudhvi.HowToCreateAStringObject;

public class A9 {
public static void main(String[] args) {
	String s="javaaaaaaaaaa";
	String s1="";
	while(s.length()>0) {
		char c=s.charAt(0);
		s1=s.replace(c+"","");
		int count=s.length()-s1.length();
		System.out.println(c+"="+count);
		s=s1;
	}
}
}
