package com.prudhvi.pallindrome;

public class P11 {
public static void main(String[] args) {
	
	String s="malayalam";
	
	System.out.println(ispallindrome(s));
}
public static boolean ispallindrome(String s) {
	char[] c=s.toLowerCase().toCharArray();
	int i=0,j=c.length-1;
	while(i<j) {
		if(c[i]!=c[j]) return false;
		i++;j--;
	}
	return true;
}
}
