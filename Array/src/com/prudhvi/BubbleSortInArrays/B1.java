package com.prudhvi.BubbleSortInArrays;

public class B1 {
public static void main(String[] args) {
	int[] a= {1,21,64,13,54,64,34};
	sort(a);
	for(int i:a) {
		System.out.println(i+" ");
	}
}
public static void sort(int[] a) {
	for(int i=0;i<=a.length-1;i++) {
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1])  {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
}
}
