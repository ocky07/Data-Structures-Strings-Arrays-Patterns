package com.prudhvi.Tester;

public class A7 {
public static void main(String[] args) {
	String s=removeduplicate("javadeveloper");
	System.out.println(s);
}
private static java.lang.String removeduplicate1(java.lang.String string2) {
	// TODO Auto-generated method stub
	return null;
}
static String removeduplicate(String s) {
	String s2="";
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(s2.indexOf(c)==-1) s2+=c;
	}
	return s2;
}
}
