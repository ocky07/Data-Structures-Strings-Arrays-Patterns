package pack1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.border.MatteBorder;

public class BackTrackingDemo {
public static void main(String[] args) {
	
	String exp="[a-z][0-9]\\2";
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the valiedation: ('=')");
	String str=scn.next();
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(str);
	System.out.println(m.matches());
	
}
}
