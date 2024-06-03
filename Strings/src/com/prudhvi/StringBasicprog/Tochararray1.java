package com.prudhvi.StringBasicprog;

public class Tochararray1 {
	public static void main(String[] args) {
		String s="javadev";
		char[] arr=s.toLowerCase().toCharArray();
		for(int i=0;i<=arr.length()-1;i++)
		{
			System.out.println(arr.charAt(i));      
		}
	}

}
