package FourtyoesOfInterface;

public class A {

	public void m1(Shape s) {
		System.out.println("hello");
	}

	public void m1(Circle c) {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		
		A a=new A();

		a.m1(new Shape(50,40));
		
	}
}