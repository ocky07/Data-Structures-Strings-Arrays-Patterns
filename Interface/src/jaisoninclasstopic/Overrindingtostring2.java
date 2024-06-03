package jaisoninclasstopic;

class Employee{
	String name;
	String id;
	int age;
	public Employee(String name,String id,int age) {
		this.name=name;
		this.id=id;
		this.age=age;
	}
	@Override
	public String toString() {
	
		return "Student [name="+name+", id="+id+", age"+age+"]";
	}
}

public class Overrindingtostring2 {

	public static void main(String[] args) {
	Employee e1=new Employee("Ocky"," ***",25);
	System.out.println(e1.toString());

	}

}
