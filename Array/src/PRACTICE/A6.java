package PRACTICE;

public class A6 {
	static int mid=0;
public static void main(String[] args) {
	int[] a= {4,5,9,6,2,9,5,2,1,5};
	int ele=2;
	System.out.println(binarysearch(a,ele));
	System.out.println(mid);
}
public static int binarysearch(int[] arr,int e) {
	int last=arr.length-1, first=0;
	while(first<=last) {
		 mid=(first+last)/2;
		if(mid==e) return mid;
		else if(e<arr[mid]) last=mid-1;
		else first=mid+1;
	}
	return -1;
	
	
}
}
