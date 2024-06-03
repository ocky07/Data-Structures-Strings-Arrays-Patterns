package BasicLevel_programmes;

import java.util.Scanner;

public class P22 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size : here");
		int num=scn.nextInt();
		for(int i=0;i<=num;i++) {
		
			for(int j=num;j>=i;j--) {
			System.out.print(" ");
		} 
		System.out.print("*");
       System.out.println();
}
	}
}
