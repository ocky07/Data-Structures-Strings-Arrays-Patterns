package com.prudhvi.M10;

public class S2 {
public static void main(String[] args) {
	String s="Madam";
	System.out.println(ispallindrome(s));
}
static boolean ispallindrome(String s) {
	char[] ch=s.toLowerCase().toCharArray();
	int i=0,j=ch.length-1;
	while(i<j) {
		if(ch[i]!=ch[j]) return false;
		i++;
		j--;
	}
	return true;
	
}
}
