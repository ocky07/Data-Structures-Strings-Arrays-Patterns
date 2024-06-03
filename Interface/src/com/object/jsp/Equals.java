package com.object.jsp;

class A{
	int i;
	public A(int i) 
	{
		this.i=i;			// false
		
	}
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof A)) return false;
		return this.i==((A)obj).i;
	}
}


public class Equals {
		public static void main(String[] args) {
			int a=20;
			int l=20;
		//  System.out.println(10==10);     		// true
		//  System.out.println(a==l);             // true
		  
		  A a1=new A(10);
		  A a2=new A(10);
		  //System.out.println(a1==a2);            //false
		  System.out.println(a1.equals(a2));
		  
		}
		
}
