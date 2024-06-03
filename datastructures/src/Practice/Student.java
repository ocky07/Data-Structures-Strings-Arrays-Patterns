package Practice;

import java.util.Arrays;
import java.util.Comparator;

public class Student  {
	int sno;
	String name;
	int marks;
	
	public Student(int s,String n,int m) {
		this.sno=s;
		this.name=n;
		this.marks=m;
	}
	public String toString() {
		return "RollNo."+sno+" name= "+name+" marks ="+marks;
		
	}
	
	public static void main(String[] args) {
		
		Student[] s=new Student[5];
		s[0]=new  Student(1,"prudhvi",99);
		s[1]=new  Student(2,"lathika",85);
		s[2]=new  Student(3,"sunitha",75);
		s[3]=new  Student(4,"kalpana",75);
		Arrays.sort(s,new Roll());
		for(Student q:s) {
			System.out.println(q);
		}
		
	}
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
}
class Roll implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Student)o1).sno-((Student)o2).sno;
	}
	
}
class marks implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Student)o1).marks-((Student)o2).marks;
	}
	
}
class name implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((String)o1).length()-((Student)o2).length();
	}
	
}
