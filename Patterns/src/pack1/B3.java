package pack1;

public class B3 {
public static void main(String[] args) {
	
	int p=5;
	for(int i=1;i<=p;i++) {
		for(int j=p-i;j>0;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
}
}
