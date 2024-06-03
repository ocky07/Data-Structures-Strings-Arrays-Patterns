package jaisoninclasstopic;


class A{
	int i;
	public A(int i) {
		this.i=i;
		
	}
	@Override
	public String toString() {
		
		return "A [i="+i+"]";
	}
	@Override
	public boolean equals(Object obj) {
	
		if(!(obj instanceof A)) return false;
		A a=(A)obj;
		return this.i == ((A)obj).i;
	}
}


public class Test {
public static void main(String[] args) {
	
}
}
