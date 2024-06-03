package com.prudhvi.SelectionSortInArrays;

public class SelectionSort {

	public static void slcsort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) index=j; 
			}
			if(i!=index) {
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {2,2,1,5,4,5,8};
		slcsort(arr);
		System.out.print("[");
		for(int n:arr) {
			System.out.print(n+",");
		}
		System.out.print("]");

	}

}
