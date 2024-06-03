package com.prudhvi.Comparetomethod;

import java.util.Scanner;

public class ana {
		public static void main(String[] args) {
	
	String s="abcd";
	String  s1="dcba";
	if(anaa(s,s1))System.out.println("is anagrame");
	else System.out.println("is not anagrame");
}
	public static boolean anaa(String s,String s1 ) {
	
	while(true) {
		if(s.length()==0&&s1.length()==0) return true;
		if(s.length()!=s1.length()) return false;
		char c=s.charAt(0);
		s=s.replace(c+"", "");
		s1=s1.replace(c+"", "");
		}
	
}
}

