package com.dsabusted.Array.Intialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MoveZeroes_BruteForce {

	public static void main(String[] args) {
		int[] nums1= {0,1,0,3,12};
		
		System.out.println(Arrays.toString(moveZero(nums1)));
		
		
	}
	
	
	public static int[] moveZero(int[] nums1)
	{
		int count=0;
		for(int num:nums1)
		{
			if(num!=0)
			{
				nums1[count]=num;
				count++;
			}
		}
		while(count<nums1.length)
		{
			nums1[count]=0;
			count++;
		}
	return nums1;	
	}
}
