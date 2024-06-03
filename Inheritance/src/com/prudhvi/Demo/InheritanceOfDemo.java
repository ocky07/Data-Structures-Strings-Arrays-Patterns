package com.prudhvi.Demo;

public class InheritanceOfDemo {
		int i;
		int j;
		int k;
		
	public static void main(String[] args) {
		
		B b=new B();
		System.out.println(b.i);
		System.out.println(b.k);
		System.out.println(b.j);
		b.m1();
		b.m4();
		b.m2();
		b.m3();
		
			
		}
}
class Z                   //super class 
{
	int i;
	int k;
	public static void m1() 
	{
		System.out.println("im m1 of the A class");
	}
	public  void m4() 
	{
		System.out.println("im m4 of the A class");
	}
	
}
class B extends Z              // sub class
{
	int j;
	public static void m2() 
	{
		System.out.println("im m2 of the  B class");
	}
	public static void m3() 
	{
		System.out.println("im m3 of the B class");
	}
	
}
