package com.dsabusted.Array.Intialization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateFromSort_TwoPointer {

	public static void main(String[] args) {
		int[] nums= {0,0,2,2,3,3,4};
		int i=0,j=1;
		while(j<nums.length)
		{
			if(nums[i]==nums[j])
			{
				j++;
			}
			else
			{
				nums[++i]=nums[j];
				j++;
			}
		}
	    int num=i+1;
		System.out.println("The array after removal of duplicate :"+Arrays.toString(nums));
		System.out.println("number of duplicate num:"+num);
	}
	

}
