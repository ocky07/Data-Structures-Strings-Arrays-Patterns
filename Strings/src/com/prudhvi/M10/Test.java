package com.prudhvi.M10;

public class Test {
public static void main(String[] args) {
	String s="123";
	int count=0;
	int sum=0;
	char[] c=s.toCharArray();
	for(int i=0;i<=c.length-1;i++) {
		   int su=(char) (c[i]-'0');
		   System.out.println(su);
			count++;
		}
	System.out.println("Count="+count);
		}
	
	}

