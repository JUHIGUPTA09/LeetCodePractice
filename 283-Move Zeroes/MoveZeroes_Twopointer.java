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

public class MoveZeroes_Twopointer {

	public static void main(String[] args) {
		int[] nums1= {0,1,0,3,12};
		
		System.out.println(Arrays.toString(moveZero(nums1)));
		
		
	}
	
	
	public static int[] moveZero(int[] nums1)
	{
		int left=0,right=0;
		int temp=0;
		while(right<nums1.length)
		{
			if(nums1[right]!=0)
			{
			
				temp=nums1[right];
				nums1[right]=nums1[left];
				nums1[left]=temp;
				left++;			
			}
			right++;
		}
	return nums1;	
	}
}
