package com.prudhvi.M10;

public class MatchesAndEquals {
	public static void main(String[] args) {
		
		String s="java";
		String s1="java";
		String s2=new String ("java");
		
		
		System.out.println(s.matches(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
	//-----------------------------------------------------------
		System.out.println(s1.matches(s2));
	}
}
