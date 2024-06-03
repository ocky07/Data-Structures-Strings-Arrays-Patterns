package com.prudhvi.HowToCreateAStringObject;

public class RevseMethod {
public static void main(String[] args) {
	String s="java" ;
	rev(s);	
}

static void rev(String s) {
   for(int i=s.length()-1;i>=0;i--) {
 System.out.print(s.charAt(i));

}
   System.out.println();
   System.out.println(s);
}
}
