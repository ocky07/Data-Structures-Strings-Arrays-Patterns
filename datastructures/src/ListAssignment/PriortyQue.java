package ListAssignment;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriortyQue {
public static void main(String[] args) {
	
	Queue<Integer> q=new PriorityQueue<>();
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(5);
	q.add(5);
	//System.out.println();
	for(Integer p:q) {
		System.out.println(p);
	}
	
}


}
