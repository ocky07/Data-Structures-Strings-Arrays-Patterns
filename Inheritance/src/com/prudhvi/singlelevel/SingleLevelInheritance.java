package com.prudhvi.singlelevel;


public class SingleLevelInheritance {

	public static void main(String[] args)
	{
			B b=new B();
			System.out.println(b.i);
			System.out.println(b.j);
			b.displeyA();
			b.displeyB();
	
		}
		
	}
	 class A
	 {
		 int i;
		 public void displeyA() {
			 System.out.println("i="+i);
			 
		 }
		
	}
	 class B extends A
	 {
		 int j;
		 public void displeyB() {
			 System.out.println("j="+j);
			 
		 }
		 
		 
	 }
