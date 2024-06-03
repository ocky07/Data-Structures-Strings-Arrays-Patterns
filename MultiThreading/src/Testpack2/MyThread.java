package Testpack2;

public class MyThread extends Thread{
public void run() {
	for(char c='a';c<='d';c++) {
		System.out.println(c);
		try {
			Thread.sleep(720);
		} catch (Exception e) {
			
		}
		
	}
}
}
