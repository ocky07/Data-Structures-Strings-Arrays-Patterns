package com.prudhvi.Tester;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1 {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
	//	char[] arr=s1.toCharArray();
		int i=s1.length()-1;
		int j=0;
		while(i>j) {
			Pattern p= Pattern.compile(s1);
			Matcher m=p.matcher(s2);
		}

	}

}
