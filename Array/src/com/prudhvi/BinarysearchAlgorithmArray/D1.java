package com.prudhvi.BinarysearchAlgorithmArray;

public class D1 {
public static void main(String[] args) {
	
	int[] a= {10,36,54,54,5,4};
	int e=4;
	System.out.println(search(a,e,0,a.length-1));
}

public static int search(int[] a, int e, int start, int end) {
	if(start>end) return -1;
	int mid=(start+end)/2;
	if(e==a[mid]) return mid;
	else if(e<=a[mid]) return search(a, e, start, mid-1);
	else return search(a, e, mid+1, end);
}
}