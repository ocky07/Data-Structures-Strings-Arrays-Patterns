package pack1;

public class B2 {
public static void main(String[] args) {
	int l=3;
	
	for(int i=1;i<=(l/2)+1;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		  System.out.println();
	}
	for(int i=(l/2);i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		  System.out.println();
	}	
}
}
