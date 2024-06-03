package com.prudhvi.Hierarchical;

public class TestClass {

	public static void main() {
		P a=new P();// superclass (A) properties only we can access...
		a.x=10;
		a.y=20;
		a.m1();
	/////////////////////////	6
		Q b=new Q();// subclass(B) of the superclass(A) :efficiently we can access all
		b.i=90;
		b.j=70;
		b.x=80;
		b.y=60;
		b.m1();
		b.m2();
	/////////////////////////
		P a1=new Q();     //   * upcasting (overriden methods && generic methods)
		a1.x=101;        //   * Here we can not access the specific methods . . .
		a1.y=102;
		a1.m1();
	////////////////////////
		Q b1=(Q)a1;      //   *Downcasting (O.v.m && G.m && s.m)
		b1.x=201;	    //    *Here we can access the specific methods . . .
		b1.y=202;
		b1.i=203;
		b1.j=204;
		b1.m1();
		b1.m2();
		}
	///////////////////  I want B class properties A class properties also...!
	    
	}
	class P{
		int x;
		static int y;
		public static void m1() {
			System.out.println("hello");
		}
	}
	class Q extends P{
		int i=90;
		static int j;
		public void m2() {
			System.out.println("Hi");
		}
	}
	class S extends P{
		
	}
