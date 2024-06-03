package com.prudhvi.HowToCreateAStringObject;

public class SumOfTheArrayElements {
	//static int s=0;

	public static void main(String[] args) {
		int[] a= {10,20,30};
		System.out.println(sum(a));
	}
	public static int sum(int[] a) {
		int s = 0;
		for(int i=0;i<=a.length-1;i++) 
		{
	 s+=a[i]; 
		}
		
		return s;

}
	}
