package com.prudhvi.M10;

public class CoountCharacter {
	public static void main(String[] args) {
		String s="#j@v@d8&*#ev310p3r,se";
		int NumOfvowels=0;
		int NumOfconsulnats=0;
		int NumOfintegers=0;
		int NumOfSchar=0;
		int sumOfthenumber=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch!='a'&& ch!='e' && ch!='i' && ch!='o' && ch!='u')NumOfconsulnats++;
				else NumOfvowels++;
			}
			else if(ch>='0' && ch<='9') {
				int n=ch-'0';
				sumOfthenumber+=n;
				NumOfintegers++;
			}
			else if(ch=='!'|| ch=='@'||ch=='#'|| ch=='$'||ch=='&'||ch=='*'|| ch=='+'||ch=='?'|| ch=='.'||ch==',') {
				NumOfSchar++;
			}
		}
		System.out.println("NumOfvowels ="+NumOfvowels+"\n"+"NumOfconsulnats ="+NumOfconsulnats+"\n"+"NumOfintegers ="+"\n"+"NumOfSchar ="+NumOfSchar);
		System.out.println(sumOfthenumber);
		
	}
}
