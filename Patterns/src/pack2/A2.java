package pack2;

public class A2 {
public static void main(String[] args) {
	int n=20;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			
      if(i==1 || j==(n/2)+1 || i==n || j==n ||j==1 ||i==(n/2)+1 || i==j || i+j==n+1) {
				System.out.print("*");
			}else System.out.print(" ");
		}
		System.out.println();
	}
}
}
