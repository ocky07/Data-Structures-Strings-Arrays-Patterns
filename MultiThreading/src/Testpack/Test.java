package Testpack;
class MyThread_A implements Runnable
{

	@Override
	public void run() {
	 for(int j=1;j<=5;j++) {
		 System.out.println("Hi");
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }
		
	}
	
}
class MyThread_B implements Runnable{

	@Override
	public void run() {
		for(int i='a';i<='e';i++) {
			System.out.println((char) i+"");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

}
public class Test {
public static void main(String[] args) {
	MyThread_A t1=new MyThread_A();
	MyThread_B  t2=new MyThread_B();
	Thread t=new Thread(t1);
	Thread tt=new Thread(t2);
	t.start();
	tt.start();
	
	
	
}
}
