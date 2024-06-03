package com.prudhvi.pallindrome;

public class P3 {
public static void main(String[] args) {
		
	String s="malayalam";
	char[] arr=s.toUpperCase().toCharArray();
	int i=0,j=arr.length-1;
	
	while(i<j) {
		if(arr[i]!=arr[j]){
			System.out.println("This is not a pallindrome: "+s);
		}
		
		i++;
		j--;
	}
	System.out.println(i+"   "+j);
	if(i==j) {
	System.out.println("this is an pallindrome: "+s);
	}	
}
}
