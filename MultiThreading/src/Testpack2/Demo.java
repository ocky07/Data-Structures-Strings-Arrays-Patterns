package Testpack2;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main "+i);
			Thread.sleep(720);
			
		}
	}
}
