package Arithmatical_Exception;

import java.util.Scanner;

public class Bank {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the amount Here: ");
	int amount=scn.nextInt();
	Account a=new Account(6000);
	
	try {
		a.withdraw(amount);
		System.out.println("withdraw done..."+amount);
		System.out.println("current balance.."+a.getBalance());
	} catch (InsufficientException e) {
		System.out.println(e.getMessage());
		
	}
}
}
