package com.prudhvi.Comparetomethod;

public class Panagrame {
public static void main(String[] args) {
	String s="abcdefghijklmnopqrstvuwxyz";
	if(pan(s)) System.out.println("is panagrame ");
	else System.out.println("not a panagaram");
	
}
public static boolean pan(String s) {
	
	for(char c='a';c<='z';c++) {
		if(s.indexOf(c)==-1) return false;
	}
	return true;
}
}
