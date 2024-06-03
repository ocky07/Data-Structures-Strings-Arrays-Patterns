package com.prudhvi.BubbleSortInArrays;

public class Bubblesort1 {

	public static void bbsort(int[] x) {
		for(int i=0;i<x.length-1;i++) {
			for(int j=0;j<x.length-1-i;j++) {
				if(x[j]<x[j+1]) {
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {2,3,6,5,9,8,4,5,6};
		bbsort(arr);
		System.out.print("[");
		for(int n:arr) {
			
			System.out.print(n+",");
			
		}
		System.out.print("]");
		
		
	}

}
