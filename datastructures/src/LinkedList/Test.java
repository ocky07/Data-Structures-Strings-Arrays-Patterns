package LinkedList;

public class Test {
public static void main(String[] args) {
	DobLinkedList l=new DobLinkedList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.remove(3);
	for(int i=1;i<=l.size()-1;i++) {
		System.out.println(l.getele(i));
	}
	
	
	
	
}
}
