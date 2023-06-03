package com.array;

import java.util.Arrays;

public class ArrayReplaceElements {
// replace negative element by it's next element square
	
	public void replaceElement(int c[])
	{
		for(int i=0;i<c.length;i++)
		{
			if(c[i]<0)
			{
				c[i]=c[i+1]*c[i+1];
			}
		}
		System.out.println(Arrays.toString(c));
	}
	public static void main(String[] args) {
		int c[]= {3,6,-7,6,-9,8};
		System.out.println(Arrays.toString(c));
		
		ArrayReplaceElements b= new ArrayReplaceElements();
		b.replaceElement(c);
	}
}
