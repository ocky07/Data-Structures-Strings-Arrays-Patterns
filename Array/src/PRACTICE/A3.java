package PRACTICE;

public class A3 {
public static void main(String[] args) {
	int[] a= {6,1,3,2};
	int s1=a[0],s2=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<s1) s1=a[i];
		s2=s1;
		s1=a[i];
		if(a[i]<s2 || s2==s1)
			s2=a[i];
		}
	System.out.println(s2);
	}

}
