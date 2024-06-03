package StringReverseTesting;
public class T4 {
public static void main(String[] args) {
	
	String s= "j5ava i1s a2n o3ops lan4g";
	
	String[] a=s.split(" ");
	
	String s2="";	
	
	for(char k='0';k<='9';k++) {
		
	for(int i=0;i<=a.length-1;i++) {
		 String ss=a[i];
		for(int j=0;j<=ss.length()-1;j++) {
			char c=ss.charAt(j);
				if(k==c) s2+=ss.replace(k+"","")+" ";	
			}
		}
	}
	System.out.println(s2.trim());
  }
} 