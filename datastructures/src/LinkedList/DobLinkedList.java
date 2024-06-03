package LinkedList;

public class DobLinkedList {
		private Nodee first=null;
		private int count=0;
		
public void add(Object o) {
	if(first==null) {
		first=new Nodee(o, null, null);
		count++;
	}
	Nodee curr=first;
	while(curr.next!=null) {
		curr=curr.next;
	}
	curr.next=new Nodee(o, null, curr);
	count++;	
}
public int size() {
	return count;

}
public void inSertingEle(int index,Object o) {
	if(index<=-1 ||index>=size())throw new IndexOutOfBoundsException();
	if(index==0) {
		first=new Nodee(o, first.next, null);
		count++;
		return;
	}
	Nodee curr=first;
	for(int i=1;i<index;i++) {
		curr=curr.next;
	}
	Nodee n=new Nodee(o, curr.next, curr);
	curr.next.prev=n;
	curr.next=n;
	count++;	
}
public void remove(int index) {
	if(index<=-1 ||index>=size())throw new IndexOutOfBoundsException();
	if(index==0) {
		first=first.next;
		count--;
		return;
	}
	Nodee curr=first;
	for(int i=1;i<index;i++) {
		curr=curr.next;
	}
	curr.next=curr.next.next;
	count--;
}
public Object getele(int index) {
	if(index<=-1 ||index>=size())throw new IndexOutOfBoundsException();
	Nodee curr=first;
	for(int i=1;i<=index;i++) {
		curr=curr.next;
	}
	return curr.ele;
}
}
