package com.prudhvi.pallindrome;

public class P1 {
public static void main(String[] args) {
	
	String s="madam";
	System.out.println(ispallindrome(s));	
}
public static boolean ispallindrome(String x) {
	char[] arr=x.toCharArray();
	int i=0,j=arr.length-1;
	while(i<j) {
		if(arr[i]!=arr[j]) return false;
		i++;
		j--;
	}
	System.out.println("This word was pallindrome :\n"+x);
	return true;
	
}
}
