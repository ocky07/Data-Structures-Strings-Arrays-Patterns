package com.prudhvi.BasicsOfArrays;

public class A2 {
	public static void main(String...prudhvi) {
		int [] arr=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		for(int a:arr) {
			//System.out.println(a);
		}
		int b[];
		b=arr;
		System.out.println(b[0]);
		arr[0]=40;
		System.out.println(b[0]);
		int c[];
		c=b;
		System.out.println(c[0]);
		arr[0]=100;
		System.out.println(c[0]);
		
	}

}
