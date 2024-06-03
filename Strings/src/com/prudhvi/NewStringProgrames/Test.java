package com.prudhvi.NewStringProgrames;

public class Test {
public static void main(String[] args) {
	
	String s="i love mom";
	String s1="";
	char[] ca = s.toCharArray();
	int i=ca.length-1,j=0;
	while(j<i) {
		while(j<i && ca[i]!=' ')i--; {
			int k=i+1;
			String t="";
			while(k>=j) {
				t+=ca[k];
				k--;
						}
			s1+=t;
			if(j<=i) s1+=" ";
			i--;
			j=i;
		}
	}
	System.out.println(s1);
	
}
}
