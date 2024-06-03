package com.prudhvi.StringBasicprog;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		System.out.println("enter the string : " );
		Scanner scn=new Scanner(System.in);
		String s=scn.next().toLowerCase();
		 
		for(int i=0;i<=s.length()-1;i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
