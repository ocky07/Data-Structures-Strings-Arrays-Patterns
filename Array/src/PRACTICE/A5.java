package PRACTICE;

public class A5 {
public static void main(String[] args) {
	int[] a= {4,5,9,8,6,2,3,1};
	int ele=2;
	System.out.println(linearsearch(a,ele));
}
public static int linearsearch(int[]x,int e) {
	
	for(int i=0;i<x.length;i++) {
		if(x[i]==e) return i;
		
	}
	return -1;
}
}
