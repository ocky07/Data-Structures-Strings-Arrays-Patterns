package com.prudhvi.Comparetomethod;

public class WithoutUsingSlitMethod {
public static void main(String[] args) {
	
	String s1="java is an oops lang";
	String s2="";
	char[] a=s1.toCharArray();
	int i=0,j=0;
	
	while(j<a.length) {
	while(j<a.length && a[j]!=' ') j++;
	String t="";
	int k=j-1;
	 while(k>=i) {
		 t+=a[k];
		 k--;
	 }
	 s2+=t;
	 if(j<a.length)s2+=" "; {
		 j++;
		 i=j;
	 }
	}
	System.out.println(s2);
}


	
}

