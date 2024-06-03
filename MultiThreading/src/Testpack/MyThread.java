package Testpack;

public class MyThread extends Thread {
	@Override
	public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("child  ="+i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
		}
		

	}
	
	
	
	}}



