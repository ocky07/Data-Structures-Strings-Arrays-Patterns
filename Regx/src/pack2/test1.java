package pack2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the valiad mail here :");
	String input=scn.next();
	String exp="^(?=*.[123])";
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(input);
	System.out.println(m.matches());
	
	
}
}  	
