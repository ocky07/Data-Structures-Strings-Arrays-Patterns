package com.prudhvi.M10;

public class Smaller_pallindrome {
public static void main(String[] args) {
	String s="malayalam";
    String smallpal="";
	for(int i=0;i<s.length()-1;i++) {
		for(int j=i+1;j<s.length();j++) {
			if(ispallindrome(s,i,j)) {
				String temp=s.substring(i, j+1);
				 smallpal=temp;
				
				if(smallpal.length()>=temp.length()) {
					smallpal=temp;
				}
			}
		}
	}
	System.out.println(smallpal);
}
public static boolean ispallindrome(String s,int start,int end) {
	int i=start,j=end;
	while(i<j) {
		if(s.charAt(i)!=s.charAt(j)) return false;
		i++;j--;
	}
	return true;
}
}
