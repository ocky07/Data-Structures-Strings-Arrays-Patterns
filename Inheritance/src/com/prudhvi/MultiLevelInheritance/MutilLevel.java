package com.prudhvi.MultiLevelInheritance;

public class MutilLevel {

	public static void main(String[] args) {
		C c=new C();
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c.k);
		c.displeyA();
		c.displeyB();
		c.displeyC();
		
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
class C extends B
{
	 int k;
	 public void displeyC() {
		 System.out.println("i="+k);
		 
	 }
	
}