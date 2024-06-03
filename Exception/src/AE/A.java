package AE;

public class A {
public static void main(String[] args) {
	
	   int val=1;
	   int lines=10;
       for(int i=1;i<=lines;i++) {
    	   for(int j=val;j>=1;j--)
    		   System.out.print(j);
    	   if(lines/2+1>i) val++;
    	   else val--;
    	   System.out.println();
       }
	
	
}
}
