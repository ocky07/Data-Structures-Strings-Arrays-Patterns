package Constractor;

class Test2{
	public Test2() {
		System.out.println("no args");
		
	}
	public Test2(int a) {
	
		System.out.println("one args");
	} 
	public Test2(int b,int c) {
		this(6);
	
		System.out.println("two args");
	}
	public void mz() {
		System.out.println();
	}
}
public class Test1 extends Test2  {
	public Test1() {
		System.out.println("no args");
		
	}
	public Test1(int a) {
		this();
		System.out.println("one args");
	} 
	public Test1(int b,int c) {
		this(5);
		System.out.println("two args");
	}

	public static void main(String[] args) {
		Test1 t=new Test1(2,3);
		System.out.println(t);
	
		//System.out.println(new Test1(5));
		//System.out.println(new Test1(2,3));
		Test2 t2=new Test2();
		t2.mz();
	}
	public void mx() {
		System.out.println("im mx");
	}
	public void my() {

		this.mx(); 
		
		super.mz();//this is possible
		System.out.println("im my");
	}
	public static void mp() {
		System.out.println("im mp from sub class");
	}
	public static void mq() {
		this.mp();                                   // its not possible
		System.out.println("im mq from sub class");
	}

}
