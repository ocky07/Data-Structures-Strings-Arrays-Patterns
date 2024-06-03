package STRINGBUFFER;
public class Demo1 
{
public static void main
(String[] args)
{
    StringBuffer s=new StringBuffer("java");
	System.out.println(s);
	s.append(" i");
	s.append(" love");
	s.append( 143);
	System.out.println(s);
	String ss=s.toString();
	System.out.println(ss);
}
}
