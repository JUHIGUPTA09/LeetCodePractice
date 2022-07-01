package com.dsabusted.Array.Intialization;

import java.util.Arrays;

public class ReverseInteger_SecondApproach {
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int x=1534236469;
		long result=0;
		while(x!=0)
		{
			result=(result*10)+x%10;
			x=x/10;
		}
		if(result>=Integer.MIN_VALUE && result<=Integer.MAX_VALUE)
		{
			System.out.println((int)result);
		}
		else
		{
			System.out.println(0);
		}
}
}