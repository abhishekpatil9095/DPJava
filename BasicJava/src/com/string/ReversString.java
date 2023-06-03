package com.string;

import java.util.Scanner;

public class ReversString {

	public void reverseString(String s)
	{
		System.out.println(s);
		String revers="";
		for(int i=s.length()-1;i>=0;i--)
		{
			revers= revers+s.charAt(i);
		}
		System.out.println(revers);
	}
	
	public void reversWord(String s)
	{
		String st[]= s.split(" ");
		String reversevalue="";
		for(int i=0;i<st.length;i++)
		{
			String word=st[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord=revWord+word.charAt(j);
			}
			reversevalue=reversevalue+" "+ revWord;
		}
		System.out.println(reversevalue);
	}
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String s= sc.nextLine();
	
	ReversString r= new ReversString();
	r.reverseString(s);
	System.out.println("==============================");
	r.reversWord(s);
	}

}
