package com.prudhvi.ArraysBasicOperation;

public class AdditionInArray {
public static void main(String[] args)
{
	int[] arr= {10,20,30};
	int sum=0;
	for(int n:arr) {
		sum+=n;
	}
	System.out.println(sum);
}
}
