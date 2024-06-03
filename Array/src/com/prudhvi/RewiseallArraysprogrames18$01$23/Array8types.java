package com.prudhvi.RewiseallArraysprogrames18$01$23;

import java.lang.reflect.Array;

public class Array8types {
	public static void main(String[] args) {
		// int[] a=new int[4];
		       
		byte[] b=new byte[9];					
		short[] s1=new short[9];
		int[] i=new int[9];   
		float[] f=new float[9];					
		double[] d=new double[9];				
		long[] l=new long[9];					
		char[] c=new char[9];					
		boolean[] bl=new boolean[9];		
		Array[] a=new Array[9];
		String[] s=new String[9];
		Object[] o=new Object[9];
		System.out.print("1.");
		for(byte n:b) {
			System.out.print(n+",");
		}
		System.out.println();
		System.out.print("2.");
		for(short n1:s1) {
			System.out.print(n1+",");
		}
		System.out.println();
		System.out.print("3.");
		for(int n:i) {
			System.out.print(n+",");
		}
		System.out.println();
		System.out.print("4.");
		for(String n1:s) {
			System.out.print(n1+",");
		}
		System.out.println();
		System.out.print("5.");
		for(float n1:f) {
			System.out.print(n1+",");
		}
		System.out.println();
		System.out.print("6.");
		for(double n1:d) {
			System.out.print(n1+",");
		}
		System.out.println();
		System.out.print("7.");
		for(long n1:l) {
			System.out.print(n1+",");
		}
		System.out.println();
		System.out.print("8.");
		for(char n1:c) {
			System.out.print(n1+",");
		}
		System.out.println();
		System.out.print("9.");
		for(boolean n1:bl) {
			System.out.print(n1+",");
		}
		System.out.println();
		System.out.print("10.");
		for(Array n1:a) {
			System.out.print(n1+",");
		}
		System.out.println();
		System.out.print("11.");
		for(Object n1:o) {
			System.out.print(n1+",");
		}
	}

}
