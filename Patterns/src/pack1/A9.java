package pack1;
public class A9 {
public static void main(String[] args) {
	int num=5;
	for(int i=1;i<=num-1;i++) {
		for(int j=num-1;i<=j;j--) {
			System.out.print(" ");
		}
		System.out.println();
	}
	for(int k=1;k<=num;k++) {
		//System.out.print("*");
		for(int l=1;l<=num;l++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}
}
