package com.prudhvi.Hierarchical;


public class HierarchicalInheritance {

	public static void main(String[] args) {
		B b=new B(); 
		System.out.println(b.i);
		System.out.println(b.j);
		b.displeyA();
		b.displeyB();
		C c=new C();
		System.out.println(c.i);
		System.out.println(c.k);
		c.displeyA();
		c.displeyC();
	}

}
class A                              // super class
{
	 int i;
	 public void displeyA() {
		 System.out.println("i="+i);
		 
	 }
	
}
class B extends A                         // sub class
{
	 int j;
	 public void displeyB() {
		 System.out.println("j="+j);
		 
	 }
	 
	 
}
class C extends A                          // sub class
{
	 int k;
	 public void displeyC() {
		 System.out.println("i="+k);
		 
	 }
	
}
