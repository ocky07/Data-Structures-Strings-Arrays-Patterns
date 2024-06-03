package Testpack;

public class Demo  {
	
public static void main(String[] args) throws InterruptedException {
	
	MyThread l=new MyThread();
	l.start();
	
	for(int i=0;i<=8;i++) {
		System.out.println(i);
	}

	
	
	
	
}}
