package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R1 {
public static void main(String[] args) {
	
	String exp=",[6789][0-9]{9}";
	
	String str="balaya90145599555ntr90154499944scott9999999999";
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(str);
	while(m.find()) {
	    System.out.println(m.start());
		System.out.println(m.end());
		System.out.println(m.group());
		System.out.println("------------------------------");
	}
}
}
