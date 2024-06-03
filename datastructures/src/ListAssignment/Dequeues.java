package ListAssignment;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeues {
public static void main(String[] args) {
	
	Deque<Integer> d=new ArrayDeque<>();
	d.add(10);
	d.addLast(80);
	d.addLast(20);
	d.addFirst(30);
	
	
	for(Integer i:d) {
		System.out.println(i);
	}
}
}
