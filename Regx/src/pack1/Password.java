package pack1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
public static void main(String[] args){ 
	
	String exp = "^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$";
	
	//String exp="(?=.*[0-9])(?=.*[!@#$%^&*])(?=.*[A-Z])(?=.*[a-z])(?=\\S+$).{8,20}";
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the your Password: ('=')");
	String password=scn.next();
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(password);
	System.out.println(m.matches());
	
	
}
}

/*                       "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";*/