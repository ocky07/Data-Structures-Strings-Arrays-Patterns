package com.prudhvi.M10;

public class S1 {
public static void main(String[] args) {
	String s="madam";
	System.out.println(isPallindrome(s));
}
 static boolean isPallindrome(String s) {
	char[] ch=s.toCharArray();
	int i=0,j=ch.length-1;
	while(i<j) {
		if(ch[i]!=ch[j]) return false;
		i++;
		j--;
	}
	return true;
	}
}
