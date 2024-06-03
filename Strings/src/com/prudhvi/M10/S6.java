package com.prudhvi.M10;

public class S6 {
public static void main(String[] args) {
	String s="jfdjf56gf54g654g6f54";
	int count=0;
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c>='0' && c<='9') {
			count++;
		}
	}
	System.out.println(count);
}
}
