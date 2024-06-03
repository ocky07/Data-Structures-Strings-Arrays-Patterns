package com.prudhvi.HowToCreateAStringObject;

public class SUMOFTHEELEMENTSIN_ARRAY {
	public static void main(String[] args) {
		
		String [] a= {"DAD","MOM","ME"};
		SUMOFTHEELEMENTSIN_ARRAY.sum(a);
	}
	public static void sum(String[] arr) {
		
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.println(arr[i]);
		}
		
		
	}
}
