package pack1;

public class A5 {
public static void main(String[] args) {
	int n=5;
	for(int i=0;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print("*");
		}
		for(int k=n;k>=i;k--) {
			System.out.print(" ");
		}
		System.out.println();
	}
}
}
