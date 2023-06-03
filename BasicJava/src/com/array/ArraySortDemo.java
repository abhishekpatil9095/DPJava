package com.array;

import java.util.Arrays;
// sorted array in ascending order
public class ArraySortDemo {

	public void sortElements(int b[])
	{
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					int copy=b[i];
					b[i]=b[j];
					b[j]=copy;
				}
			}
		}
		System.out.println("sorted array= "+Arrays.toString(b));
	}
	
	public static void main(String[] args) {
		int b[]= {5,9,8,7,6};
		
		System.out.println("given array= "+ Arrays.toString(b));
		ArraySortDemo d= new ArraySortDemo();
		d.sortElements(b);
	}
}
