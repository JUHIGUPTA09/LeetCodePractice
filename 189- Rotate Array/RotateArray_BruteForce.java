package com.dsabusted.Array.Intialization;

import java.util.Arrays;

public class RotateArray_BruteForce {
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] num= {1,2,3,4,5,6,7};
		int k=3;
		int n=1;
		int previous=0,temp=0;
	while(n<=k)
	{
		previous=num[num.length-1];
		for(int j=0;j<num.length;j++)
		{
			temp=num[j];
			num[j]=previous;
			previous=temp;
		}
		n++;
	}
	System.out.println(Arrays.toString(num));
}
}