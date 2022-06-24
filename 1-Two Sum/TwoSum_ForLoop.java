package com.dsabusted.Array.Intialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum_ForLoop {

	public static void main(String[] args) {
		int[] nums= {2,7,11,15};
		List<Integer> l=new ArrayList<>();
		int target=9;
	
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					l.add(i);
					l.add(j);
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(l.stream().toArray()));
		
	}

}
