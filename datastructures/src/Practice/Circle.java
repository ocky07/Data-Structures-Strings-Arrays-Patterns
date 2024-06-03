package Practice;

import java.util.Arrays;

public class Circle implements Comparable{

	
	int radius;
	public Circle(int c) {
		this.radius=c;
	}
	@Override
	public int compareTo(Object o) {
		
		return radius-((Circle)o).radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	public static void main(String[] args) {
		Circle[] c=new Circle[5];
		c[0]=new Circle(90);
		c[1]=new Circle(80);
		c[2]=new Circle(70);
		c[3]=new Circle(60);
		c[4]=new Circle(60);
			Arrays.sort(c);
	for(Circle p:c) {
		System.out.println(p);
		}
	}
		
		
	}
	

