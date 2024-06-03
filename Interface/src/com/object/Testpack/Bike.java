package com.object.Testpack;


public class Bike {
	public interface vechical {       //public ,default, protected,private
	public void airCondition();
	public void Switch();
		
	}
	public void airCondition() {
		
		
	System.out.println("the system will be cool");
	}
	public void Switch() {
		System.out.println("The system will be on or off");
	}
	public static void main(String[] args) {
		//Bike b=new Bike();
	//	b.airCondition();
		//b.Switch();
	}
}
class Car implements Bike.vechical {
  	
	public void airCondition() {
		System.out.println("the system will be cool");
		}
		public void Switch() {
			System.out.println("The system will be on or off");
		}
		public static void main(String[] args) {
			Bike b=new Bike();
			b.airCondition();
			b.Switch();
			
		}
}
