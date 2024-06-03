package com.prudhvi.HowToCreateAStringObject;

import java.util.Scanner;
 
public class WithOut_UsingInBuilt_Methods {
	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
	System.out.println("enetr the string : here");
	String s=scn.next();
	System.out.println(rev(s));
	}
	public static int len(String s) {
		int i=0;
		while(true) {
			try {
			s.charAt(i);
		}catch (Exception e) {
			return i;
			}
		 i++;
	
		}
	}
	public static String rev(String s) {
		
		String s1="";
		
		for(int i=len(s)-1;i>=0;i--) {
			s1+=s.charAt(i);
			//System.out.print(s1);
		}
		return s1;
		
		
	}
	
	//CharSequence
}
	
	



/*------------------------------

length() method

toCharArray() Method

charAt(args) Method this method is hidden method of the charsequence interface....
*/