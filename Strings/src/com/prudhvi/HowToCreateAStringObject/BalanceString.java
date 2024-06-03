package com.prudhvi.HowToCreateAStringObject;

import java.util.Stack;

public class BalanceString {
public static void main(String[] args) {
	String s="[{()}]";
	System.out.println(isBalance(s));
}
public static boolean isBalance(String s) {
	Stack<Character> stack=new Stack<Character>();
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c=='[' || c=='{'|| c=='(') {
			stack.push(c);
		}else if(c==']' || c=='}'|| c==')'){
			if(stack.isEmpty()) return false;
			char c2=stack.pop();
			if(pair(c2,c)) return false;
			
		}
	}
	if(stack.isEmpty()) return true;
	else return false;
}

}