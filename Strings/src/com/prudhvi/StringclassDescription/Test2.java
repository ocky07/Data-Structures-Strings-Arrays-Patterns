package com.prudhvi.StringclassDescription;

public class Test2 {
public static void main(String[] args) {
	String s1="java";
	System.out.println(revstng(s1));
}

static String revstng(String s) {
	String ss="";
	for(int i=s.length()-1;i>=0;i--) {
		ss+=s.charAt(i);
	}
	return ss;
	}
}
