package com.prudhvi.Constructor;



interface I{
	
	
}

class A implements I {
	
	private A() {
		
	}
	public static A getinstancy() {
		System.out.println("I i'm Enter this method");
		return new A();
	}
	
}

public class Test1 {
	
public static void main(String[] args) {
	
    	I a1=A.getinstancy();    //We can refer the super class (Object or ) if the main class is extends the any other class that class name WE CAN TAKE THE REFERNCE OF THE OBJECT CLASS
 }
}

