 package LinkedList;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class SingleLinkedList {
	private Node first=null;
	private int count=0;
	
	public void add(Object o) {
		if(first==null) {
			first=new Node(o, null);
			count++; return;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(o, null);
		count++;
	}
	public void addinsert(int index,Object o) {
		if(index<=-1||index>=size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			first=new Node(o, first);
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}		
		curr.next=new Node(o, curr.next);
		count++;
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
	public Object get(int index) {
		if(index<=-1||index>=size()) throw new IndexOutOfBoundsException();
		
		Node curr=first;
		for(int i=0;i<=index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public void rev() {
		Node prev=null,curr=first,next=null;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
		first=prev;
		
	}
	
	
	
}

