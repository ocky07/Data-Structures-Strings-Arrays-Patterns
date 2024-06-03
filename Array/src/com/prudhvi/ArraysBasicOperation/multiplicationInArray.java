package com.prudhvi.ArraysBasicOperation;

public class multiplicationInArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		int product=2;
		for(int n:arr) {
			product*=n;
			System.out.println(n+"this element multiple into  :"+product+" time");
		}
		//System.out.println(product);

	}

}
