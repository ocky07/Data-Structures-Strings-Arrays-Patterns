package DataAbstaraction;

//Java program to illustrate concrete class

//This is an interface
interface X {
public abstract	int product(int a, int b);  //By default public abstract //return type is should be declered
public abstract	int sum(int a, int b);		//By default public abstract // return type is should be declered
}

//This is an abstract class
abstract class Product implements X {

	// this method calculates
	// product of two numbers
	public int product(int a, int b)
	{
		return a * b;
	}
}

//This is a concrete class that implements
class Test2 extends Product {

	// this method calculates
	// sum of two numbers
	public int sum(int a, int b)
	{
		return a + b;
	}

	// main method
	public static void main(String args[])
	{
		Test2 ob = new Test2();
		int p = ob.product(5, 10);
		int s = ob.sum(5, 10);

		// print product
		System.out.println("Product: " + p);

		// print sum
		System.out.println("Sum: " + s);
	}
}