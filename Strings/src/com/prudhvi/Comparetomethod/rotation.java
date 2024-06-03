package com.prudhvi.Comparetomethod;

public class rotation {
public static void main(String[] args) {
	
	String s="abcde";
	String ss="edcba";
	String s1="";
	for(int i=ss.length()-1;i>=0;i--) {
		s1+=ss.charAt(i);
	}
	if(s1.equals(s))System.out.println("ok");
	else System.out.println("not okay");
}
}
