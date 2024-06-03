package com.prudhvi.Constructor;


class X {
	
	private X() {
		
	}
	public static  X getinstancy()       //Helpper method of the this method 
	{
		System.out.println("I i'm Enter this method");
		return new X();			     	//factory method (singleton design patter)
	}
	
}


public class Test2 {

	public static void main(String[] args) {
		X a1=X.getinstancy();	
	Object b=A.getinstancy(); // we can also write the Object(Super most class of the java hirarchical) 
	}

}
