package com.dsabusted.Array.Intialization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateFromSort_HashSet {

	public static void main(String[] args) {
		int[] nums= {1,1,2};
		
		Set<Integer> s=new HashSet<>();
		for(int num:nums)
		{
			s.add(num); 
		}
		int[] arr=s.stream().mapToInt(x ->x).sorted().toArray();
        for(int i=0;i<arr.length;i++)
        {
            nums[i]=arr[i];
        }
		System.out.println(arr.length);
	}

}
