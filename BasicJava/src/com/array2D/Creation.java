package com.array2D;

import java.util.Arrays;
import java.util.Scanner;

public class Creation {

	public static void main(String[] args) {
		int a[][]= {{2,5,7},
					{3,9,7}};
		
		int arr[][]=new int [3][2];
// hard code value declaration and initialization for 2D array		
//		arr[0][0]=2;
//		arr[0][1]=5;
//		arr[0][2]=7;
//		arr[1][0]=3;
//		arr[1][1]=9;
//		arr[1][2]=7;
//		System.out.println(Arrays.deepToString(arr));
		
		//take input from user 2D array
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++)	//this for loop getting input from user for row
		{
			for(int j=0;j<arr[i].length;j++)	//this for loop getting input from user for column
			{
				arr[i][j]= sc.nextInt();
			}
		}
		System.out.println("===================================");
	//Printing output by using normal for loop of 2D array 
		for(int i=0;i<arr.length;i++)	//this for loop for row 
		{
			for(int j=0;j<arr[i].length;j++)	//this for loop for column
			{
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("====================================");
	//By using Enhance for loop to getting output 
		for(int x[]:arr)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	//By using String method get output
		System.out.println("===============================");
		System.out.println(Arrays.deepToString(arr));
	}
}
