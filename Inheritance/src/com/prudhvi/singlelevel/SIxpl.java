package com.prudhvi.singlelevel;

public class SIxpl {

	public static void main(String[] args) {
		System.out.println("Teacher asking mobile number for the child scholarship application");
        child.mobile();
	}

}
class Dad
{
	static long mobilenumber=1999999999;
	public static void mobile() {
		System.out.println("mobilenumber  :"+mobilenumber);
	}
	
}
class child extends Dad
{
	public static void NoMobile() {
		System.out.println("No mobile number");
	}
	
}