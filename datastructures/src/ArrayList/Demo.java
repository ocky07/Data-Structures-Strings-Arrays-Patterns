package ArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
public static void main(String[] args) {
	
	String[] s= {"j","python","ot"};
	Arrays.sort(s,new lencompare());
	for(String q:s) {
		System.out.println(q);
	}
	
}
}
class lencompare implements  Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((String)o1).length()-((String)o2).length();
	}
}