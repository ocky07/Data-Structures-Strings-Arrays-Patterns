package com.prudhvi.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R1 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the pass-word : Sir/Madam");
	String pwd=scn.next();
	System.out.println("First enter the ");
	String exp="(?=.*[!@#$%^&*(){}:>?<'](?=.*[0-9])(?=.*[A-Z]).{6,9}";
	Pattern compile = Pattern.compile(exp);
	Matcher matcher = compile.matcher(pwd);
	System.out.println(matcher.matches());
	
}
}
