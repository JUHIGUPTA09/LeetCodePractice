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

public class ItersectionOfTwoArray_UnSorted_SetApproach2 {

	public static void main(String[] args) {
		int[] arr1= {1,2,2,1};
		int[] arr2= {2,2};
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		set1=arrayToSet(arr1);
		set2=arrayToSet(arr2);
		set1.retainAll(set2);
		System.out.println(set1);
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
	
}
