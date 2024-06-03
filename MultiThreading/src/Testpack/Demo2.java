package Testpack;

import java.util.Comparator;

class MyThread3 extends MyThread1  implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+" Anup Sad ('_')");
	}
}} 
public class Demo2 {
public static void main(String[] args) {
//	MyThread3 t=new MyThread3();
//	Thread t1=new Thread(t); //child class instance reference i'm passing the parameter of the thread class constuctor(it is overloadded constuctor)
//	 
//	  t1.start();//new thread is created
	  MyThread3 t5=new MyThread3();
//	  MyThread3 t6=new MyThread3();
//	  Thread t7=new Thread(t);
//	  t7.start(); //thread class run() method *new thread is created*
//	  t7.run();  //thread class run() method *new thread is created*
//	  t6.run();//child thread class run method calling new thread is not created
	
	  Thread th=new Thread(t5);
	  th.run();
	  // th.start(); //new thread is created && Thread class start() method and {inside this method run method is calling(this run is override by runnable interface[abstract method]) }
	  System.out.println("Anup singh is smilling ('-')");
	  System.out.println("Anup singh is smilling ('-')");
	  System.out.println("Anup singh is smilling ('-')");
	  System.out.println("Anup singh is smilling ('-')");
	  System.out.println("Anup singh is smilling ('-')");
	  System.out.println("Anup singh is smilling ('-')");
	  System.out.println("Anup singh is smilling ('-')");
	  System.out.println("Anup singh is smilling ('-')");
	  for(char j='A';j<='D';j++) {
		  System.out.println("main thread  ="+j);
	  }
	     //Normal method call
	 // System.out.println("--------------------------------");
	 Comparator<T>
}
}

