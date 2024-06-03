package com.prudhvi.ArraysBasicOperation;

public class Substaction {
	public static void main(String []args) {
		int[] arr= {10,20,30};
		int sub=2;
		for(int n:arr) {
			n-=sub;
			System.out.println(n);
		}
		//System.out.println(sub);
	}

}
