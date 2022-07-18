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

public class PlusOne_BruteForce {

	public static void main(String[] args) {
		int[] nums1= {1,2,3,4,9};
		
		System.out.println(Arrays.toString(plusOne(nums1)));
		
		
	}
	
	
	public static int[] plusOne(int[] nums1)
	{
		for(int i=nums1.length-1;i>=0;i--)
		{
			if(nums1[i]==9)
			{
				nums1[i]=0;
			}
			else
			{
				nums1[i]++;
				return nums1;
				
			}
		}
		
		int[] nums2=new int[nums1.length+1];
		nums2[0]=1;
		return nums2;
		
	}
}
