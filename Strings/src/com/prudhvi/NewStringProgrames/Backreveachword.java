package com.prudhvi.NewStringProgrames;

public class Backreveachword 
{
public static void main(String[] args) 
{
	String s1="java is an oops lang";
	String s2="";
 
	char[] a=s1.toCharArray();
	int i=a.length-1,j=0;
	while(j<i) {
		while(j<i && a[i]!=' ')i--;
		int k=i+1;
		String t="";
		while(k>=j){
			t+=a[k];
			k--;
		}
		s2+=t;
		if(j<i) s2+=" ";
		i--;
		j=i; 
	}
	System.out.println(s2);
}
}
