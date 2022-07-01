package com.dsabusted.Array.Intialization;

import java.util.Arrays;

public class RotateArray_NewArray {
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] num= {1,2,3,4,5,6,7};
		int[] arr=new int[num.length];
		int k=3;
		k=k%num.length;
		for(int i=0;i<num.length;i++) {
			arr[(i+k)%num.length]=num[i];
		}
		
	System.out.println(Arrays.toString(arr));
}
}