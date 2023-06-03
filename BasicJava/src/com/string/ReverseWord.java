package com.string;

import java.util.Scanner;

public class ReverseWord {

	public void reversWord(String s)
	{
		String st[]= s.split(" ");
		String finalst="";
		for(int i=1;i<st.length-1;i++)
		{
			String revword="";
			for(int j=st[i].length()-1;j>=0;j--)
			{
				revword= revword + st[i].charAt(j);
			}
			finalst= finalst + revword+" ";
		}
		System.out.println(st[0]+" "+finalst+st[st.length-1]);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string elements");
		
		String s= sc.nextLine();
		
		ReverseWord e= new ReverseWord();
		e.reversWord(s);
	}
}
