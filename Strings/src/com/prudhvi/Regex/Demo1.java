package com.prudhvi.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the phone number here\nSir/Madam :('-')");
	String Phonenum=scn.next();
	String exp="[6-9]+[0-9]{9}";
	
	Pattern compile = Pattern.compile(exp);
	Matcher matcher = compile.matcher(Phonenum);
	if(matcher.matches())System.out.println("Valied number :Register");
	else System.out.println("In valied number: Not exist\nPlease enter again Sir/Madam: ('-')");
}
}
