package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
public static void main(String[] args) {
	Pattern p=Pattern.compile("[6789][0-9]{9}");
	Matcher m=p.matcher("9014559955");
	
	System.out.println(m.matches());
	
	
	
	
	/*Pattern p=Pattern.compile("a[123]");
	Matcher m=p.matcher("a3");
	
	System.out.println(m.matches());
-------------------------------------------------------------
	/*while(m.find()) {
		//System.out.println(m.start());
		//System.out.println(m.end());
		System.out.println(m.group()+" ="+m.end());
	}*/
}
}
