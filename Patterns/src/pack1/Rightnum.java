package pack1;

public class Rightnum {
public static void main(String[] args) {

	int n=5;
	int spc=n/2,star=1;
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=spc;j++) {
		System.out.print(" ");
		}
	for(int k=1;k<=star;k++) {
		System.out.print("*");
	}
	System.out.println();
	if(i<=n/2) {
		spc--;
		star+=2;
	}
	else {
		spc++;
		star-=2;
		}
	}
}
}
