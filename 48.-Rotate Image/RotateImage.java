package com.dsabusted.Array.Intialization;

public class RotateImage {

	public static void main(String[] args) {
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        //transpose
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		//reverse
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length/2;j++)
			{
				temp=arr[i][j];
				arr[i][j]=arr[i][arr.length-j-1];
				arr[i][arr.length-j-1]=temp;
			}
		}
		
		//Printing rotated image
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
