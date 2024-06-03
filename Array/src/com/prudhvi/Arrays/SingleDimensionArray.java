package com.prudhvi.Arrays;

public class SingleDimensionArray {

	public static void main(String[] args) {
		
		int [] j=new int[4];
		j[0]=1;
		j[1]=9;
		j[2]=90;
		j[3]=5;
		int[] b=j;
		b[3]=25;
	//	System.out.println(j[5]);
		for(int n:b) {
			System.out.println(n);
		}
		
	}

}
