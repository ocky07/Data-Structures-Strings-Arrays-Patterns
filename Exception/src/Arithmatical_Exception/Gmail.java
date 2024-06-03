package Arithmatical_Exception;

import java.util.Scanner;

public class Gmail {
	static String user="prudhvi";
	static int password=1234;
public static void main(String[] args) throws InvalidPasswordException {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enetr the username here :");
	String s=scn.next();
	System.out.println("enetr the password :");
	int pd=scn.nextInt();
	if (user.equals(s)) {
		
		if(password==pd) {
			System.out.println("login is done: ('=')");
		}
	 else {
		try {
		throw new InvalidPasswordException();
		}catch(InvalidPasswordException e) {
			System.out.println("InvalidPassword");
		}

	}
		}else System.out.println("invaled username :");
}
}
