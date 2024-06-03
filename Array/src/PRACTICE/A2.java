package PRACTICE;

public class A2 {
public static void main(String[] args) {
		int[] a= {2,3,6,9,8,5,6,1};
		int s=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>s)s=a[i];
			
			
		}
		System.out.println(s);
}
}

