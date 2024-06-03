package FourtyoesOfInterface;

public class Shape {
	int length;
	int breadth;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public Shape(int length, int breadth)
	{
		super();
		this.length = length;
		this.breadth = breadth;
		System.out.println(length);
		System.out.println(breadth);
	}
@Override
	public String toString() {
		return "Shape [length=" + length + ", breath=" + breadth + "]";
	}

	public int getLength() {

		return length+breadth ;
	}

	public void setLength(int length, int breath)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public void m1() 
	{
		System.out.println("shape m1");
	}
}
class Circle extends Shape
{
	int radious;
	
	public Circle(int length, int breadth, int radious) {
		super(length, breadth);
		this.radious = radious;
	}
	public Circle(int radious) 
	{
		this.radious=radious;
	}

	public void m2() {

	}
}
