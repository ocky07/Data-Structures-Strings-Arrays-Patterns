package Test1;

class A{
   int i;
   static int j;
	 public void m1() {
		 System.out.println("i'm m1() implemention for class A");
		 
	 }
	 public void mx() {
		 System.out.println("i'm  mx() implemention for the class A");
	 }
	
}

class Z extends A
{ 
 public void m1() {
	 System.out.println("i'm m1() implemention for class z");
	 
 }
 public void m2() {
	 System.out.println("i'm m2() implemention for class z");
 }
 public void m3() {
	 System.out.println("i'm m3() implemention for class z");
 }
 
}


public class Test  {

	public static void main(String[] args) {
		A a=new Z(); 
		a=new A(); 
		System.out.println(a);       
												//to change the location point to ^  //reference variable can updaute or  not ???
		System.out.println(a);      
		
			a.m1();
			System.out.println(a.i=1);
			System.out.println(a.j=2);
			
			
	}

}
