package com.string;

import java.util.Scanner;

public class CalculateWord {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string elements");
		String s= sc.nextLine();
		
		String word[]=s.split(" ");
		System.out.println(word.length);
	}
}
