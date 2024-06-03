package Testpack;

public class MyThread1 {
public void run() {
	for(char c='a';c<='z';c++) {
		System.out.println(c);
	}
	try {
		Thread.sleep(720);
	} catch (InterruptedException e) {
		
	}
}
}
