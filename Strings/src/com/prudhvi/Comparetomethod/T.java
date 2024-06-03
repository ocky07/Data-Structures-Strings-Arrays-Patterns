package com.prudhvi.Comparetomethod;

public class T {
public static void main(String[] args) {
	
	String s="java is an oops lang";
	String[] a=s.split(" ");
	String s2="";
	for(int i=a.length-1;i>=0;i--) {
		s2+=a[i];
		s2+=" ";
	}
	s2=s2.trim();
	System.out.println(s2);
}

}
