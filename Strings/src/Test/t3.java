package Test;

public class t3 {
public static void main(String[] args) {
	
	String s="challu";
	
	char[] ch=s.toCharArray();

	for(char c:ch) {
		System.out.println(c);
	}
	//===========================================
	for(int i=0;i<=ch.length-1;i++) {
		
		System.out.print(s.charAt(i));
	}
}
}
