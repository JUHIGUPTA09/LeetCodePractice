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

public class ItersectionOfTwoArray2_HashMap {

	public static void main(String[] args) {
		int[] nums1= {4,9,5,4,4};
		int[] nums2= {9,4,9,8,4};
		int[] arr;
		Map<Integer,Integer> map;
		if(nums1.length<nums2.length)
		{
			map=mapCreation(nums1);
			arr=arrayIntersection(map,nums2);
		}
		else
		{
			map=mapCreation(nums2);
			arr=arrayIntersection(map,nums1);
			
		}
	
		System.out.println(Arrays.toString(arr));
		
	}
	public static Map<Integer,Integer> mapCreation(int[] nums1)
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int num:nums1)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		return map;
	}
	
	public static int[] arrayIntersection(Map<Integer,Integer> map,int[] nums2)
	{
		  List<Integer> l=new ArrayList<>();
		for(int num:nums2)
		{
			if(map.containsKey(num)&& map.get(num)>=1)
			{
				l.add(num);
				
				map.put(num, map.get(num)-1);
				
			}
		}
		return l.stream().mapToInt(x ->x).toArray();
	}
}
