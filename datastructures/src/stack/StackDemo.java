package stack;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Vector;

import LinkedList.Node;

public class StackDemo extends Vector {
	
	private Node first=null;
	private int count=0;
	private Object[] elementData;
	
	
  public Object elementData(int index) {
        return (Object) elementData[index];
    }

	
	public  Object elementAt(int index) {
        if (index >= count) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + count);
        }

        return elementData(index);
    }

	public  Object peek() {
        int     len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }
	
	public int size() {
		return count;
	}
	
	public  int search(Object o) {
	        int i = lastIndexOf(o);

	        if (i >= 0) {
	            return size() - i;
	        }
	        return -1;
	    }

	 public  int lastIndexOf(Object o) {
	        return lastIndexOf(o, count-1);
	    }
	 
	 public  int lastIndexOf(Object o, int index) {
	        if (index >= count)
	            throw new IndexOutOfBoundsException(index + " >= "+ count);

	        if (o == null) {
	            for (int i = index; i >= 0; i--)
	                if (elementData[i]==null)
	                    return i;
	        } else {
	            for (int i = index; i >= 0; i--)
	                if (o.equals(elementData[i]))
	                    return i;
	        }
	        return -1;
	    }
	 public void push(Object o) {
		 if(first==null) {
			 first=new Node(o, null);
			 count++;
			 return;
		 } 
		 first=new Node(o,first);
		 count++;
	 }
	 public Object pop() {
		 if(first==null) throw new EmptyStackException();
		 Object ele=first.ele;
		 first=first.next;
		 count--;
		 return ele;
	 }
	 public Object get(int index) {
			if(index<=-1||index>=size()) throw new IndexOutOfBoundsException();
			Node curr=first;
			for(int i=0;i<=index;i++) {
				curr=curr.next;
			}
			return curr.ele;
		}


	


	 
	
}
