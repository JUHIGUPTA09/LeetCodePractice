package com.dsabusted.Array.Intialization;

import java.util.Arrays;

public class ReverseInteger {
	public static void main(String[] args)
	{
		int num=1534236469;
		int numresv=0;
		while(num!=0)
		{
			if(numresv<=Integer.MIN_VALUE/10||numresv>=Integer.MAX_VALUE/10)
			{
				numresv=0;
				break;
			}
			numresv=(numresv*10)+num%10;
			num=num/10;
		}
	
		System.out.println(numresv);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}

}
