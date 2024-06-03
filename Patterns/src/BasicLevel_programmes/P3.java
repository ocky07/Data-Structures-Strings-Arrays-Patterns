package BasicLevel_programmes;

import java.util.Scanner;

public class P3 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Printting T shape pattern :\n Enter the size Sir/Madam :('-')");
	int size=scn.nextInt();
	for(int i=1;i<=size;i++ ) {
		for(int j=1;j<=size;j++) {
			if(i==1 || j==(size/2)+1||i==size)
			{
				System.out.print("*");
			}if((size/2)+1==i)System.out.println("*");
			else System.out.print(" ");
		}
		System.out.println();	
	}
}
}
