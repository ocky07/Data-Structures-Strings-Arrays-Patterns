package FourtyoesOfInterface;

public  class T  {

public void m1() 
{
	System.out.println("hello");
}
public void m2() //G
{
System.out.println("bye");
}
}
class B extends T
{
	public void m1()//O.V
	{
		System.out.println("hi");
	}
	public void m3() // S.P
	{
		System.out.println("bye");
	}
}
class Test{
	public static void main(String[] args) {
		T t=new B();
		t.m1(); //hi
		t.m2();//bye
		B b=(B)t;
		
		
	}
}
