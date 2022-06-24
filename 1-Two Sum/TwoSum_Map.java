package com.dsabusted.Array.Intialization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_Map {

	public static void main(String[] args) {
		int[] nums= {2,7,11,15};
		int target=9;
		Map<Integer,Integer> map=new HashMap<>();
		int[] arr=new int[2];
		int complement=0;
		for(int i=0;i<nums.length;i++)
		{
			complement=target-nums[i];
			if(map.containsKey(complement))
			{
				arr[0]=map.get(complement);
				arr[1]=i;
				break;
			}
			map.put(nums[i], i);
		}
		System.out.println(Arrays.toString(arr));
	}

}
