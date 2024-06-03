package com.prudhvi.M10;

public class S7 {
public static void main(String[] args) {
	String s="prudhvi123648";
	int sumOfNums=0;
    int NumOfAlphabets_lowercase=0;
    int numofdigits=0;
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c>='0' && c<='9') {
			int n=c-'0';
			numofdigits++;
			sumOfNums+=n;
			
		}
		else if(c>='a' && c<='z') {
			NumOfAlphabets_lowercase++;
		}
		else {
			System.out.println("enter the proper_Order Sir // Madam");
		}
	}
	System.out.println(sumOfNums);
	System.out.println("NumOfAlphabets :"+NumOfAlphabets_lowercase);
	System.out.println(numofdigits);
	
}
}
