package com.string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String str="Hello";
		String str1="hello";
		String s1= new String("Hello");
		
		System.out.println(str.equals(str1));	// for comparing two string
		System.out.println(str.equals(s1));		
		System.out.println(str.equalsIgnoreCase(str1)); //compare without upper or lower case

		//compareTo // 0 str==str1, +ve str>str1, -ve str<str1
		System.out.println(str.compareTo(str1));	//it shows ascii value of string 
		
		String s2= "java, c, c++, python";
		String []sl=s2.split(",");	// for spliting word in a string
		
		System.out.println(Arrays.deepToString(sl));	//show the split word
		
		char ch1[]= {'w','e','l','c','o','m','e'};
		String st2= new String(ch1);	//for combining all elements from character array  
		System.out.println(st2);	
		
		String s= "my country is india";
		String s3=s.substring(5);	//for show string from that index to end of string
		System.out.println(s3);
		
		String s4=s.substring(4, 8);	// for show string start and index of string
		System.out.println(s4);
	}
}
