package com.prudhvi.Exception;

public class demo1 {

	public static void main(String[] args) {
		m1();
		
		}
	public static void m1() {
	System.out.println("program execition start");
	int fnumber=9;
	int snumber=0;
	int result=0;
	try {
	result=fnumber/snumber;
	}catch(Exception e) {
		//System.out.println(e);
		System.out.println(e.getStackTrace());
	}
	System.out.println("out put is="+result);
	System.out.println("program is end");
		}
	}
