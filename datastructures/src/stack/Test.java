package stack;

public class Test {
public static void main(String[] args) {
	
	StackDemo s=new StackDemo();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	
	System.out.println(s);
	for(int i=0;i<=s.size();i++) {
		System.out.println((Integer)s.get(i));
	}
	
	}
}
