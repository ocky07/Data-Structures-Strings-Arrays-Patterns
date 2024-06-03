package ListAssignment;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test1 {
public static void main(String[] args) {
	/*sum of the elements in the list and also avg 
	int sum=0;
	int avg=0;
	List<Integer> al=List.of(4, 5, 0, 9, 8,10);
	System.out.println(al);
	for(int i:al) {
		sum+=i;
		avg++;
		
	}
	System.out.println("the sum of the list :  "+sum);
	System.out.println("the avg of the list :"+avg);*/
//-----------------------------------------------------------------	
	/*int evnsum=0;
	
	List<Integer> al=List.of(4, 5, 0, 9, 8,10);
	System.out.println(al);
	for(int i:al) {
		if(i%2==0) evnsum+=i;
	}
	System.out.println("sum of the even elements :"+evnsum);
	*/
//------------------------------------------------------------------
	/*List<Integer> al=List.of(4, 5, 0, 9, 8,10);
	int m=al.size()/2;
	System.out.println(m);
	List<Integer> fist=new ArrayList<>(al.subList(0, m));
	List<Integer> scnd=new ArrayList<>(al.subList(m,al.size()));
	System.out.println(fist);
	System.out.println(scnd);
----------------------------------------------------------------------	
	*/
	/*List<Integer> al1=List.of(4, 5, 0);
	List<Integer> al2=List.of(8,9, 10);
	List<Integer> mergelist=new 
	al1.addAll(al2);
	mergelist.addAll(al1);
	System.out.println(mergelist);
   */
		Vector<String> v=new Vector<>();
		v.add("A");
		v.add("B");
		v.add("A");
		v.add("B");
		v.add("A");
		v.add("B");
		v.add(null);
		v.add(null);
		int duplicate=0;
		int nullvals=0;
		for(int i=0;i<=v.size()-1;i++) {
			if(v.get(i)==null)nullvals++;
			for(int j=0;j<=v.size()-1;j++) {
				if(v.get(i).equals((v).get(j))) {
					duplicate++;	
				}
				}
			System.out.println("the duplicate vals"+v.get(i)+"="+duplicate);
		}
		System.out.println("the list null vals =" +nullvals);

}
}
