package com.prudhvi.StringBasicprog;

public class ReverseEachWord {
public static void main(String[] args) {
	String s="java is an oops lang";
	char[] c=s.toCharArray();
	String s1="";
	int i=0,j=0;
	while(i<c.length) {
		while(j<c.length && c[j]!=' ')j++;
		int k=j-1;
		String t="";
		while(k>=i) {
			t+=c[k];
			k--;
		}
		s1+=t;
		if(j<c.length) s1+=" ";
		j++;
		i=j;	
	}
	System.out.println(s1);
}
}
