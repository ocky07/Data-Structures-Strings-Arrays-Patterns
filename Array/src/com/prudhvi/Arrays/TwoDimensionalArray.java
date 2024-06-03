package com.prudhvi.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] arr=new int[4][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
		arr[3][1]=9;
		arr[3][2]=6;
		for(int i=0;i<arr.length;i++) {
			int [] k= arr[i];
			for(int j=0;j<k.length;j++) {
				System.out.print(k[j]+"\t");
			}
			System.out.println();
		}
	}

}
