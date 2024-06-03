package BasicLevel_programmes;

import java.util.Scanner;

public class P11 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the size : here");
	int num=scn.nextInt();
	for(int i=0;i<=num;i++) {
		for(int j=0;j<=num;j++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	
}
}
