package Test2;
interface Iter1{
	void m1();
	void m2();
}
interface Iter2{
	void m1();
	void m3();
	void m2();
}
class Y extends X{
	public void m9() {
		System.out.println("i'm m1() implemention for class Y");
	}
	public void m2() {
		System.out.println("i'm m2() implemention for class Y");
	}
	
}
class X extends Object implements Iter1,Iter2         //internally Z class is extends with the Object class
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

public class Test1 {

	public static void main(String[] args) {
		Iter1 iter1=new X();
		Iter2 iter2=new X();
		X x1=new X();
		iter1.m1();
		iter1.m2();
        /////////////////////////////////////////////
		iter2.m1();
		iter2.m2();
		iter2.m3();
		Y y1=new Y();
		y1.m2();         // Y class object reference
		y1.m9();	    // Y class object reference
		y1.m1();       // x class object reference
		y1.m9();	  // x class object reference
		
	
	}

}
