package Set;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
public static void main(String[] args) {
	
	
	Set<Integer> s=new HashSet<>();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(2);
	s.add(1);
	s.add(2);
	s.add(3);
	s.add(null);
	
	for(Integer i:s) {
		System.out.println(i);
	}
	
}
}
