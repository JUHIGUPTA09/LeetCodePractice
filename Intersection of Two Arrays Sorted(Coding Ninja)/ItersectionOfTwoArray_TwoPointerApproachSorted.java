package com.dsabusted.Array.Intialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ItersectionOfTwoArray_TwoPointerApproachSorted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of first arrzy");
		int n=sc.nextInt();
		System.out.println("Enter the value in  first array");
		int[] arr1= new int[n];
		for(int i=0;i<n;i++)
		{
		 arr1[i]=sc.nextInt();
		}	
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println("Enter the length of second arrzy");
		int m=sc.nextInt();
		System.out.println("Enter the value in  second array");
		int[] arr2= new int[m];
		for(int i=0;i<m;i++)
		{
		 arr2[i]=sc.nextInt();
		}
		System.out.println("Array1="+Arrays.toString(arr1));
		System.out.println("Array2="+Arrays.toString(arr2));
		List<Integer> l=new ArrayList<>();
		
		int i=0,j=0;
		
		while(i<n &&j<m)
		{
			if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr1[i]==arr2[j])
			{
				l.add(arr1[i]);
				i++;
				j++;
			}
			else
			{
				j++;
			}
		}
		
		System.out.println("Intersecting digit in Array1 and Array 2 are:-"+l);
	   
	}
}
