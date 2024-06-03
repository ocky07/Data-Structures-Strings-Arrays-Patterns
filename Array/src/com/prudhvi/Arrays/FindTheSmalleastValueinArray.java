package com.prudhvi.Arrays;

public class FindTheSmalleastValueinArray {
	public static void main(String[] args) {
		int []a= {3,6,9,8};
		int s=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<s) s=a[i];
			
		}
		System.out.println(s);
	}

}
