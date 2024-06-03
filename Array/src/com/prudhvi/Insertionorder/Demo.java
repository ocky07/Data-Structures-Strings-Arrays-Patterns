package com.prudhvi.Insertionorder;

public class Demo {
public static void main(String[] args) {
	int[] a= {2,1,5,54,81,46,5,1,5};
	
	intsort(a);
	for(int n:a) {
		System.out.println(n);
	}
}
public static void intsort(int[] a) {
	
	for(int i=1;i<a.length;i++) {
		int key=a[i];
		int j=i-1;
		while(j>=0&& a[j]>key) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
	
}
}
