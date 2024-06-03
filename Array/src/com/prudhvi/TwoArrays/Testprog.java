package com.prudhvi.TwoArrays;

import java.util.Scanner;

public class Testprog {
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);	
		System.out.println("enetr the number");
		int num=scn.nextInt();
       int rev=0, temp=num ,i=1;
       
       while(temp>0) {
   		int rem=temp%10;
   		rev=(rev*10)+rem;
   		temp/=10;
     	}
       if(rev==num)System.out.println("pallindrome");
       else System.out.println("not a pallindrome");
       
}
}