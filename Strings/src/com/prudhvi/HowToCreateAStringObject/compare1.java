package com.prudhvi.HowToCreateAStringObject;

import java.util.Scanner;

public class compare1 {

	public static void main(String[] args) {
		String a="prudhvi";
		String a1=new String("prudhvi");
		//System.out.println(a==a1);
		//System.out.println(a.equals(a1));
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=scn.next();
		System.out.println("enter the index value of the string");
		int indx=scn.nextInt();
		System.out.println(m1(indx,s1));
	}

	public static char m1(int indx,String s) {
		char c=s.charAt(indx);
		System.out.println(c);
	if(indx>s.length()-1) {
			return (char) -1;
		}
		return c;
		
		
	}
	
}
