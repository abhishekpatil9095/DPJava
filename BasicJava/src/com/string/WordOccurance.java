package com.string;

import java.util.Scanner;

public class WordOccurance {

	public void occurance(String s)
	{
		String st[]= s.split(" ");
		for(int i=0;i<st.length;i++)	//this for loop for iterating upto string/ word of index
		{
			int count=1;
			boolean isvalid=false;
			for(int k=i-1;k>=0;k--)		//this for loop for checking word in string by reverse direction
			{
				if(st[i].equals(st[k]))
				{
					isvalid=true;
					break;
				}
			}
			if(isvalid==false)
			{
			for(int j=i+1;j<st.length;j++)	//this for loop for count word occurance
			{
				if(st[i].equals(st[j]))
				{
					count++;
				}
			}
			System.out.println(st[i]+" "+count);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string elements");
		String s= sc.nextLine();
		
		WordOccurance w= new WordOccurance();
		w.occurance(s);
	}
}
