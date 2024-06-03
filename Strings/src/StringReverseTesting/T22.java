package StringReverseTesting;

public class T22 {
public static void main(String[] args) {
	
	String s1="j5ava i1s a2n o3ops lan4g";
	String s2="";
	
	char[] a=s1.toCharArray();
	int i=0,j=0;
	while(j<a.length) {
		while(j<a.length) {
			
		while(j<a.length && a[j]!=' ')j++;
		int k=j-1;
		String t="";
		for(int d=1;d<=9;d++) {
		for(int y=i;y<=k;y++) {
		 if(d==a[y]){
			t+=a[y];
			if(y<=k)s2=addString(t,d,a.length);
		}
		 
		}
		}
		
		j++;
		i=j;
		
	}	
		j++;
		i=j;
		}
	System.out.println(s2);	
}
public static String addString(String t,int d,int len) {
	String ss="";
	int i=0;
	ss+=t.replace(d+"", "");
	
	if(i<len) ss+=" ";
	return ss;
}
}
