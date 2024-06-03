package com.prudhvi.Tester;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A8 {
public static void main(String[] args) {
	
	Pattern p= Pattern.compile("n");
	Matcher m= p.matcher("banana");
	while(m.find()) {
	System.out.println(m.start());
	
	
      }
   }
}
