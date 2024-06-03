package Mywrapper;

public class Mywrapper {
     int i;

	public Mywrapper(int i) {
		super();
		this.i = i;
	}


public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Mywrapper [i=" + i + "]";
	}
 
}
class Testclass{

	public static void main(String[] args) {
		
		Mywrapper m=new Mywrapper(20);
		System.out.println(m);
		
	}
}
