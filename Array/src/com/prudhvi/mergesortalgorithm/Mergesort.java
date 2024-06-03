package com.prudhvi.mergesortalgorithm;

public class Mergesort {
	public static void main(String[] args) {
		int[] a= {3,4,6,8};
		int[] b= {1,2,5,9};
		int[] c= {0,0,0,0,0,0,0,0};
		
		merge(a, b, c);
		for(int n:c) {
			System.out.print(n);
		}
		
		
	}
	public static void  merge(int[] a,int[] b,int[] c ) {
		int i=0,j=0,k=0;
		while(i<a.length && i<b.length)  {
			if(a[i]<b[j]) {
				c[k]=a[i];
				k++;
				i++;
				
				
			}else {
				c[k]=b[j];
				k++;
				j++;
			}
				
		}
		while(i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(i<b.length) {
			c[k]=b[j];
			k++;
			j++;
			
		}
	}
}
