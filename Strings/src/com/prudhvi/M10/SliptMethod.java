package com.prudhvi.M10;

public class SliptMethod {
public static void main(String[] args) {
	String s="I love my dad";
	String[] arr=s.split(" ");
	 
	for(String str:arr) {
		ch=revstring(str);
	}
	ch=ch.length;
	System.out.println(ch);
	
}
public static char[] revstring(String str) {
	    String s1="";
	for(int i=str.length()-1;i>=0;i--) {
		
		s1+=i;
	}
     char[] d=s1.toCharArray();
     return d;
     
}
}
