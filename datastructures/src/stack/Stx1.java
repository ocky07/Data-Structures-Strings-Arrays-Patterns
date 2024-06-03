  package stack;

import java.util.EmptyStackException;

import LinkedList.Node;

public class Stx1 {
private Node first=null;
private int count=0;

public void push(Object o) {
	if(first==null) {
		first=new Node(o, null);
		count++;
		return;
	}
	first=new Node(o, first);
	count++;
}
public Object pop() {
	if(first==null) throw new EmptyStackException();
	
	Object ele=first.ele;
	first=first.next;
	count--;
	return ele;
	
}
public boolean isempty() {
	if(first==null) return true;
	
	return false;
}
public Object get(int index) {
	if(index<=-1||index>=size())throw new EmptyStackException();
	
			Node crr=first;
			for(int i=0;i<=index;i++) {
				crr=crr.next;
			}
			return crr.ele;	
}
public int size() {

	return count;
}
public void remove(int index) {
	if(index<=-1||index>=size()) throw new IndexOutOfBoundsException();
	if(index==0) {
		first=first.next;
		count--;
		return;
	}
	Node curr=first;
	for(int i=1;i<index;i++) {
		curr=curr.next;
		
	}
	curr.next=curr.next.next;
	count--;

}

}
