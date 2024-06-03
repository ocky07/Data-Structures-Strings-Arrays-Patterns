package com.prudhvi.StringBasicprog;

public class Length {
	int count=0;
		
		public static void main(String[] args){
			//m1();
			String s="prudhvi";
			int count=0;
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)!=' ') 
					count++;
				}
			System.out.println(count);
		
			
	
			
		}
		public static void m2() {
			String s="prudhvi raj";
			System.out.println(s.length());
		}
		
		
	

}
