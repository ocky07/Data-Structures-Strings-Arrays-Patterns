package com.prudhvi.BasicsOfArrays;

public class A1 {

	public static void main(String[] args) {
		int arr[]; 								// syntax: datatype ref[];
		arr=new int[3]; 						//syntax : ref=object of the array(using new keyword) datatype[declear the size of an array]					// the array index will be starts from 0 index value and end with {n-1th (value)}
		arr[0]=10;								//syntax : ref[index value]=declear the value;
		arr[2]=60;
		
		System.out.print("[");
		
		for(int c1 :arr)							// foreach loop is only acceptable in arrays and collections..
		{
						
			System.out.print(c1+",");    			// the default valuesof the array index will beprinted..
		}
				System.out.println("]");		
				System.out.println(arr);  		 // the address of the reference array variable....

	}
}
