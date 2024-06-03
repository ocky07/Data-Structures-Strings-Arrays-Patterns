package com.prudhvi.Comparetomethod;

public class add {
public static void main(String[] args) {
	int[][] a= {{1,2,3},{4,5,6},{9,8,7}};
	int sum=0; int sum1=0;
	for(int[] b:a ) {
		for(int i:b) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	for(int i=0;i<a.length;i++) {
		sum+=a[i][i];
		
	}
	System.out.println(sum);
	
	for(int i=0;i<a.length;i++) {
		if(a.length%2!=0 && i==a.length/2) {
			sum1+=a[i][a.length-1-i];
		}
	}
	System.out.println(sum1);
}
}
