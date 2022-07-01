package com.dsabusted.Array.Intialization;

import java.util.Arrays;

public class RotateArray_ReverseScenrio {
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] num= {1,2,3,4,5,6,7};
		int k=3;
		System.out.println("reverse methodbcalled");
	    reverse(num,0,num.length-1);
	    System.out.println(Arrays.toString(num));
	    reverse(num,0,k-1);
	    System.out.println(Arrays.toString(num));
	    reverse(num,k,num.length-1);
	    System.out.println(Arrays.toString(num));
}
	
	public static void reverse(int[] num,int start,int end)
	{
		int temp=0;
		while(start<end)
		{
			temp=num[start];
			num[start]=num[end];
			num[end]=temp;
			start++;
			end--;
		}
	}
}