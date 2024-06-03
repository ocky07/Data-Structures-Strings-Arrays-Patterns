package com.prudhvi.BinarysearchAlgorithmArray;


public class Demo1 {
  static int mid;
	public static void main(String[] args) {
		// int[] a= {100,90,80,70,60,40,30,20,10,1};  //the order should be the assending 
		int[] a= {1,2,3,4,5};
		int ele=10;
		binarySearch(a,ele);
		System.out.println("the index position of the array is:: "+mid);
	}
	public static int binarySearch(int[] a,int e) {
		int first=0,last=a.length-1;
		while(first<=last) {
			mid=(first+last)/2;
			if(a[mid]==e) return mid;
			else if(e<=a[mid]) return last=mid-1;
			else first=mid+1;
		}
		return -1;
	}
}
