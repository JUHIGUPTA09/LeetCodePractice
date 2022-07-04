package com.dsabusted.Array.Intialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ItersectionOfTwoArray_Sorted {

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
		for(int num1:arr1)
		{
			for(int num2:arr2)
			{
				if(num1<num2)
				{
					break;
				}
				if(num1==num2)
				{
					
					l.add(num2);
					num2=num2*-1;;
					break;
					
				}
			}
		}
		
		for(int i:l)
		{
			System.out.println(i);
		}
		
		System.out.println("Intersecting digit in Array1 and Array 2 are:-"+l);
	   
	}
}
