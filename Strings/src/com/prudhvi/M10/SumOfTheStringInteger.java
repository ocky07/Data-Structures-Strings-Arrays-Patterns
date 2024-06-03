package com.prudhvi.M10;

public class SumOfTheStringInteger {
public static void main(String[] args) {
	
	String s="JavaDevep";
	String sum="";
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		if(c>='A'&& c<='Z') {
			int n=(char) (c -'A');
			sum+=n;
		}
		
	}
	System.out.println(sum);
	
}
}
