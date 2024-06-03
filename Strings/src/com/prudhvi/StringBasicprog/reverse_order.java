package com.prudhvi.StringBasicprog;

import java.util.*;

public class reverse_order {

	public static void main(String[] args) {
		System.out.println("enter the string :");
		Scanner scn=new Scanner(System.in);
		String s=scn.next().toLowerCase();
		String ss="";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
