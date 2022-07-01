package com.dsabusted.Array.Intialization;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of a arrzy");
		int n=sc.nextInt();
		System.out.println("Enter the value in array");
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
		 arr[i]=sc.nextInt();
		}
 
	int	start=0;
	int end=n-1;
	int temp=0;
	while(start<end)
	{
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	
	System.out.println("Rverse array is:-");
	System.out.println(Arrays.toString(arr));
	
		
	}

}
