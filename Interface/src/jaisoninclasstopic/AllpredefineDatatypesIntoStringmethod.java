 package jaisoninclasstopic;
 
class Datatypes{
		byte a;
		short b;
		int c;
		float d;
		double e;
		long f;
		char g;
		boolean h;
	
	public Datatypes(byte a, short b, int c, float d, double e, long f, char g, boolean h) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.e = e;
			this.f = f;
			this.g = g;
			this.h = h;
		}
		@Override
		public String toString() {
			return "Datatypes [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", f=" + f + ", g=" + g
					+ ", h=" + h + "]";
		}
		
	
}

public class AllpredefineDatatypesIntoStringmethod {

	public static void main(String[] args) {
		
			Datatypes i=new Datatypes(0,0,0,0.0f,0.0d,'A',true);
			System.out.println(i);
	}

}
