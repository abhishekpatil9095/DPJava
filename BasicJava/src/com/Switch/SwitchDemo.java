package com.Switch;

import java.util.Scanner;

public class SwitchDemo {
	
	public static void main(String[] args) {
		 int balance=1000;
		 Scanner sc= new Scanner (System.in);
		 System.out.println("Welcome to kotak ATM");
		boolean epin=false;
		 char ch;
		 int password=1717;
		 int i=1;
		 
		 while(i<=3)
		 {
			 
			 System.out.println("Enter your pin");
			 int pin= sc.nextInt();
			 
			 if(password==pin)
			 {
				 epin=true;
				 break;
			 }
			 else
			 {
				 System.out.println("you entered wrong pin "+i+" times "+(3-i)+" your remaining chances");
				 i++;
			 }
		 }
		
		 if(epin)
		 {
			do
			{
				
				System.out.println("1.deposit\n2.withdraw\n3.check\n4.exit");
				int choice= sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("how many amount you deposit");
					int deposit= sc.nextInt();
					balance=balance+deposit;
					System.out.println("Deposit amount= "+balance);
					break;
				case 2:
					System.out.println("how many amount you withdraw");
					int withdraw= sc.nextInt();
					if(withdraw<balance)
					{
						balance=balance-withdraw;
						System.out.println("Withdraw amount= "+balance);
					}
					else
					{
						System.out.println("insufficient balance");
					}
					break;
				case 3:
					System.out.println("Total balance= "+balance);
					break;
				case 4:
					System.out.println("Thanks for using our service");
					System.exit(0);
					break;
					default:
						System.out.println("invalid choice");
					}
				System.out.println("do you want to continue?(Y/N)");
			ch= sc.next().charAt(0);

			}while(ch=='y'||ch=='Y');
		 }
		 else
		 {
			 System.out.println("You entered wrong pin more than 3 times! your bank account blocked for next 24 hours! ");
		 }
	}

}
