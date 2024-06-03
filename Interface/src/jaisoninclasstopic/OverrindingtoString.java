package jaisoninclasstopic;

class Student{
	String name;
	String id;
	int age;
	public Student(String name,String id,int age) {
		this.name=name;
		this.id=id;
		this.age=age;
	}
	@Override
	public String toString() {
	
		return "Student [name="+name+", id="+id+", age"+age+"]";
	}
}


public class OverrindingtoString {

	public static void main(String[] args) {
		Student s1=new  Student("sahoo","$$$",21);
		System.out.println(s1.toString());
		
	}

}
