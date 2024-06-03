package pack1;

public class P1 {
public static void main(String[] args) {
	int[] a= {54,4,5,4,5,4,1};
	System.out.println(search(a,1));
}
public static int search(int[] a,int e) {
	
	for(int i=0;i<a.length;i++) {
	if(a[i]==e) return i;	
	}
	return -1;

}
}