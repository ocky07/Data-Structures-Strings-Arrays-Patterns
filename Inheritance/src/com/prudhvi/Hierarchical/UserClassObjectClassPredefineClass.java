package com.prudhvi.Hierarchical;
public class UserClassObjectClassPredefineClass {
public static void main() {
	AA a=new AA();// superclass (A) properties only we can access...
	a.x=10;
	a.y=20;
	System.out.println();
/////////////////////////	6
	BB b=new BB();// subclass(B) of the superclass(A) :efficiently we can access all
	b.i=90;
	b.j=70;
	b.x=80;
	b.y=60;
	b.m1();
	b.m2();
/////////////////////////
	AA a1=new BB();     //   * upcasting (overriden methods && generic methods)
	a1.x=101;        //   * Here we can not access the specific methods . . .
	a1.y=102;
	a1.m1();
////////////////////////
	BB b1=(BB)a1;      //   *Downcasting (O.v.m && G.m && s.m)
	b1.x=201;	    //    *Here we can access the specific methods . . .
	b1.y=202;
	b1.i=203;
	b1.j=204;
	b1.m1();
	b1.m2();
	}
///////////////////  I want B class properties A class properties also...!
    
}
class AA{
	int x;
	static int y;
	public static void m1() {
		System.out.println("hello");
	}
}
class BB extends AA{
	int i=90;
	static int j;
	public void m2() {
		System.out.println("Hi");
	}
}
class CC extends AA{
	
}
