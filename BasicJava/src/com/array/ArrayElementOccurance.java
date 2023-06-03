package com.array;

import java.util.Arrays;

public class ArrayElementOccurance {
//find elements occurance in array
	
	public void findOccurance(int a[])
	{
		for (int i=0;i<a.length;i++)	//iterating this loop for array
		{
			int count=1;
			boolean isvisited= false;
			for(int k=i-1;k>=0;k--)		//iterating this loop for comparing value only once.
			{
				if(a[i]==a[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
			for(int j=i+1;j<a.length;j++) //iterating this loop for compare duplicate number
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
		//	if(count==1)	//unique elements
			if(count>1)		//duplicate elements
			{
			System.out.println(a[i]+" "+count);
			}
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {1,5,7,9,6,8,5,8,9,7,7};
		System.out.println(Arrays.toString(a));
		ArrayElementOccurance z= new ArrayElementOccurance();
		z.findOccurance(a);
	}
}
