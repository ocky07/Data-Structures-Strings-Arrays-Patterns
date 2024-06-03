package BasicLevel_programmes;

import java.util.Scanner;

public class P4 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the Range Sir/Madam:('-')");
	int ran=scn.nextInt();
	int l=1;
	for(int i=1;i<=ran;i++) {
		for(int j=1;j<=l;j++) {
			System.out.print("*");
			
		}
		System.out.println();
		l++;
	}
}
}
