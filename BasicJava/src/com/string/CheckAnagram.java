package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public boolean checkAnagram(String s1, String s2)
	{
		boolean isanagram= false;
		if(s1.length()==s2.length())
		{
			String st1=s1.toLowerCase();
			String st2=s2.toLowerCase();
			
			char ch1[]=st1.toCharArray();
			char ch2[]=st2.toCharArray();
			
			System.out.println(Arrays.toString(ch1));
			System.out.println(Arrays.toString(ch2));
			
			//sort logic
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			System.out.println("=====================================");
			System.out.println(Arrays.toString(ch1));
			System.out.println(Arrays.toString(ch2));
			
			String str1= new String(ch1);
			String str2= new String(ch2);
			
			if(str1.equals(str2))
			{
				isanagram=true;
			}
		}
		return isanagram;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1 st string elements");
		String s1= sc.nextLine();
		
		System.out.println("enter 2 nd string elements");
		String s2= sc.nextLine();
		
		CheckAnagram c= new CheckAnagram();
		c.checkAnagram(s1, s2);
	}
}
