package PRACTICE;

import java.util.Scanner;

public class A4 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int[] a= {4,5,4,5,4,4};
	int e=9;
	for(int i=0;i<a.length;i++) {
		
		if(a[i]==e) {
			System.out.println(i);
		}
	}
}
}
