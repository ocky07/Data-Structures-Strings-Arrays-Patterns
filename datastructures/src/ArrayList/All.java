package ArrayList;

import java.util.Collection;
import java.util.Collections;

public class All {

	private Object[] a=new Object[5];
	private int count=0;
	
	public void add(Object o) {
		if(count>=a.length) {
			increse();
		}
		a[count++]=o;
	}
	public void addinsert(int index,Object ele) {
		if(index<=-1|| index>=size()) throw new IndexOutOfBoundsException();
		if(count>=a.length) increse();
		for(int i=size()-1;i>=index;i--) {
			a[i+1]=a[i];
		}
		a[index]=ele;
		count++;
	}
	public Object get(int index) {
		return a[index];
	}
	public void remove(int index) {
		if(index<=-1|| index>=size()) throw new IndexOutOfBoundsException();
		for(int i=index+1;i<size();i++) {
			a[i-1]=a[i];
		}
		count--;
	}
    
		public void clear() {
			a=new Object[5];
			count=0;
		}
		
	
	public  int size() {
		
		return count;
	}
	public int arraycap() {
		return a.length;
	}
	public void increse() {
		Object[] temp=new Object[a.length+5];
		System.arraycopy(a, 0, temp, 0,a.length);
		a=temp;
	}
	
	
	
}
