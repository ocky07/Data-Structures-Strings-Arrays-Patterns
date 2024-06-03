package BasicLevel_programmes;
import java.util.Scanner;
public class Middle_Line_Row
{
public static void main(String[] args)
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the  Range of the middle Raw line");
	int l=scn.nextInt();
	for(int i=1;i<=l;i++)
	{
		for(int j=1;j<=l;j++) 
		{   
			if((i==l/2 || i==l) || (j==l && i==j ))
			{
				System.out.print("*");
        	}
		}
		System.out.println();
	 }
   }
}
