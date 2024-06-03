package com.prudhvi.BubbleSortInArrays;
//WRITE A PROGRAME TO ARRANGE THE ORDER OF AN ARRAY ( SMALL VALUES TO BIG VALUES......)
public class BubbleSort {

	public static void bubblesrt(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int[] a= {3,7,4,2,8,6,9};
	 bubblesrt(a);
	 System.out.print("[");
		for(int n:a) {
		System.out.print(n+",");
		}
		System.out.print("]");
	

	}

}
