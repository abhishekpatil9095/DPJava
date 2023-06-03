package com.array2D;

import java.util.Arrays;

public class twoDSum {

	public void sumRow(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.print(" sum= "+sum);
			System.out.println();
		}
	}
	
	public void sumColumn(int a[][])
	{
		for(int i=0;i<a[0].length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				sum= sum+a[j][i];
				System.out.println(a[j][i]+" ");
			}
			System.out.println("sum= "+sum);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int a[][]= {{1,3,4},
					{2,5,7},};
		System.out.println(Arrays.deepToString(a));
		twoDSum t= new twoDSum();
		t.sumRow(a);
		t.sumColumn(a);
	}
}
