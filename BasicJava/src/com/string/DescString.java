package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class DescString {

	public void desc(String s)
	{
		String st[]=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].length()<st[j].length())
				{
					String temp= st[i];
					st[i]=st[j];
					st[j]=temp;
				}
				else if(st[i].length()==st[j].length())
				{
					if(st[i].compareTo(st[j])<0)
					{
						String temp=st[i];
						st[i]=st[j];
						st[j]=temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(st));
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string elements");
		String s= sc.nextLine();
		
		DescString d= new DescString();
		d.desc(s);
	}
}
