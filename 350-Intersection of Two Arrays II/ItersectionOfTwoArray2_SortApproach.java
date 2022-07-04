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

public class ItersectionOfTwoArray2_SortApproach {

	public static void main(String[] args) {
		int[] nums1= {4,9,5,4,4};
		int[] nums2= {9,4,9,8,4};
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i=0,j=0;
		List<Integer> l=new ArrayList<>();
		while(i<nums1.length && j<nums2.length)
		{
			if(nums1[i]<nums2[j])
			{
				i++;
			}
			else if(nums1[i]==nums2[j])
			{
				l.add(nums1[i]);
				i++;
				j++;
			}
			else
			{
				j++;
			}
		}
		
		
		System.out.println(l);
		
		
		
	}
}
