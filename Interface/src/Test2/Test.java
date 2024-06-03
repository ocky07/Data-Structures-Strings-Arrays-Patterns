package Test2;
interface Iter{
	int i=10;   //static constant
	void m1();
	void m2();   //By default "public" "abstract" methods
}
class Z implements Iter
{ 
	@Override
	public void m1() //override method         //i'm not intreasted in the implemention of the super class 
	{
		System.out.println("i'm m1() implemention for class z");
    }
	@Override
	public void m2() //override method		   //i'm not intreasted in the implemention of the super class 
    {
		System.out.println("i'm m2() implemention for class z");
    }	
	public void m3()                          //specific method
	{
		System.out.println("i'm m3() implemention for class z"); 
    }
 
}


public class Test {

	public static void main(String[] args) {
	
		Iter i=new Z();
		System.out.println(i.i);
		i.m1();    
		i.m2();
		//    i.m3();     // we can cant not callthe specific method

	}

}
