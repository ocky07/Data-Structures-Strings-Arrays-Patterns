package pack1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gmailvadidation {
public static void main(String[] args) {
	String exp="[a-z A-Z][a-z A-Z 0-9]*@[A-Z a-z 0-9]+[.]com";
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the your Gmail: ('=')");
	String gmail=scn.next();
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(gmail);
	System.out.println(m.matches());
	//foreach();
	Class.forName(gmail);
}

private static void foreach() {
	// TODO Auto-generated method stub
	
}
}
