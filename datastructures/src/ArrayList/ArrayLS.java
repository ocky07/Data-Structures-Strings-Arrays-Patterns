
package ArrayList;

public class ArrayLS {
	private Object[] a=new Object[5];
	private int count=0;
	
	public void add(Object o) {
		if(count>=a.length) {
			increase();
		}
		a[count++]=o;
	}
	public void increase() {
		Object[] temp=new Object[a.length+5];
		System.arraycopy(a, 0, temp, 0, a.length);
		a= temp;
	}
	
public int size() {
	return count;
}
public void remov(int index) {
	if(index<=-1||index>=size()) throw new IndexOutOfBoundsException("not index");
	for(int i=index+1;i<size();i++) {
		a[i-1]=a[i];
	}
	count--;
	
}
public void intsertadd(int index,Object o) {
	if(index<=-1||index>=size())throw new IndexOutOfBoundsException();
	
	if(count>=a.length)increase();
	for(int i=size()-1;i>=index;i--) {
		a[i+1]=a[i];
	}
	a[index]=o; count++;
}
public Object get(int index) {
	if(count>=a.length)throw new IndexOutOfBoundsException();
	return a[index];
}
public boolean contain(Object o) {
     for(int i=0;i<a.length;i++) {
    	 if(o.equals(a[i])) return true;
     }
     return false;
}
public Object[] getA() {
	return a;
}
public void setA(Object[] a) {
	this.a = a;
}
public void setobject(int index,Object o) {
	if(count>=a.length)throw new IndexOutOfBoundsException();
	a[index]=o;
	}
}

