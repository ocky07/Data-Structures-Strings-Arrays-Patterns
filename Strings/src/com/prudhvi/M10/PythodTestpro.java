package com.prudhvi.M10;

public class PythodTestpro {
public static void main(String[] args) {
	int[] i= {1,3,2,9,4,6,};
	//int temp=0;
	for(int j=0;j<=i.length-1;j++) {
		for(int k=j+1;k<=i.length-1;k++) {
			int temp1=i[j]+i[k];
			if(temp1==7) {
				System.out.println(i[j]+","+i[k]+"="+temp1);
			}
		}	
		}
	}
}

