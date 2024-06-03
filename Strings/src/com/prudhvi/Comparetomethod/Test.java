package com.prudhvi.Comparetomethod;

public class Test {

	public static void main(String[] args) {
		String s="java";
		String s1="java";
		String s2=new String("java");
		String s3=new String("java");
		// System.out.println(s==s1);            //t
		// System.out.println(s.equals(s1));	//t
		//System.out.println(s==s2);			//f
		//System.out.println(s.equals(s2));		//t
		//System.out.println(s2==s3);           //f
		System.out.println(s2.equals(s3));		//t
		
	}

}
