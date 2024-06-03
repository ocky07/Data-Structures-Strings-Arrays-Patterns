package com.prudhvi.Comparetomethod;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine().toLowerCase();
		System.out.println("Enter the line of the code here: Sir /Madam");
		String s2="";
		String[] a=s.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			s2+=a[i];
			s2+=" ";
		}
		s2=s2.trim();
		System.out.println(s2);

	}

}
