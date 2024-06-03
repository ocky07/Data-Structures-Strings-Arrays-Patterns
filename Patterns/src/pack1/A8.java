package pack1;

public class A8 {
public static void main(String[] args) {
	
	int len=5;
	for(int i=1;i<=len;i++) {
		for(int j=len;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
