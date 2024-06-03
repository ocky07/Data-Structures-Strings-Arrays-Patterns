package com.prudhvi.BinarysearchAlgorithmArray;

public class BinaryschRecursion {

	public static void main(String[] args) {
		int[] a= {10,20,30,42};
		int find=30;
		System.out.println(sch(a,find,0,a.length-1));
	}
   public static int sch(int[] a,int find,int first,int last) {
	   if(first>last) return -1;
	   int mid=(first+last)/2;
	   if(find==a[mid]) return mid;
	   else if(find<=a[mid]) return sch(a,find,first,mid-1);
	   else  return sch(a,find,mid+1,last);
   }
}
