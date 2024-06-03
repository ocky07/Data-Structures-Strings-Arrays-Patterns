package Wrapperclasses;

public class String {
	public String(java.lang.String string) {
		
	}
	public static void main(String[] args) {
		String s=new String("prudhvi");
		m2("s");
	}
	public static void m2(Object o) {
		String s1=(String)o;
		System.out.println(s1);
	}

}
