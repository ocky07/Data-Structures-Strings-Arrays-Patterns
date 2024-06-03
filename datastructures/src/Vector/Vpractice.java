package Vector;

import java.util.Arrays;
import java.util.Vector;

//vector 
public class Vpractice {
public static void main(String[] args) {
	
	Vector<Integer> v1=new Vector<>();
	
	v1.add(10);
	v1.add(20);
	Vector<Integer> v2=new Vector<>();
	v2.add(10);
	v2.add(20);								//synchronized				
	v1.addAll(2,v2);
	//System.out.println(v1);
	//v1.remove(0);
	//v1.removeAll(v2);
	//v1.clear();
	//System.out.println(v1.set(1, 40));
	//v1.setElementAt(40, 3);
			//to converting the vector to array
	
	Object[] o=v1.toArray();	
	   Object[] arr=new Object[] {v1};
	   Vector v4=new Vector(Arrays.asList(arr));
	
	for(Object i:v4) {
		System.out.print((Integer)i+" ");
	}
	System.out.println("\n"+"size of the vector array :"+v1.size());
	System.out.println("capacity of the vector array :"+v1.capacity());
//	System.out.println(v1.get(5));
	System.out.println(v1.containsAll(v2));
	
	
	

}
}