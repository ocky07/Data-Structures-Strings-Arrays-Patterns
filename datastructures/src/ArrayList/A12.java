package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A12 {
	public static void main(String[] args) {
		ArrayList<Integer> t=new ArrayList<>();
		
		System.out.println(capacity(t));
	
}
	public static int capacity(ArrayList<Integer> t) {
		return t.lastIndexOf(t);
		
	}
	public int capacity(int[] T) {
		
		return T.length;
	}
	
}
	