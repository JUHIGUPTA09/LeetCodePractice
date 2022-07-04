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

public class ItersectionOfTwoArray_UnSorted_SetApproach {

	public static void main(String[] args) {
		int[] arr1= {1,2,2,1};
		int[] arr2= {2,2};
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		set1=arrayToSet(arr1);
		set2=arrayToSet(arr2);
		if(set1.size()>set2.size())
		{
			System.out.println(Arrays.toString(intersectionOfArray(set1,set2)));
		}
		else
		{
			System.out.println(Arrays.toString(intersectionOfArray(set2,set1)));
		}
		
	}
	public static Set<Integer> arrayToSet(int[] arr)
	{
		Set<Integer> set=new HashSet<Integer>();
		for(int num:arr)
		{
			set.add(num);
		}
		return set;
	}
	public static int[]  intersectionOfArray(Set<Integer> set1,Set<Integer> set2)
	{
		List<Integer> l=new ArrayList<Integer>();
		for(int i:set2)
		{
			if(set1.contains(i))
			{
			l.add(i);	
			
			}
		}
		return l.stream().mapToInt(x ->x).toArray();
	}
}
