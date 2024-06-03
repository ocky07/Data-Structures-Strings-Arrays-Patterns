package BasicLevel_programmes;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scn.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
