// Write a program to find the max of three numbers.

package practice;

import java.util.Scanner;

public class GreatestThreeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		
		System.out.print("Enter the third number:");
		int num3 = sc.nextInt();
		
		// 10,3,20 // 10,30,20
		if(num1>num2) {		
			// below given if else is known as nested if else.
			if(num1>num3) {
				
			System.out.println(num1 + " is the greatest number");	
			}
			else {
				
				System.out.println(num3 + " is the greatest number");
			}
			
		}
		else { 
			// below given if else is also nested type nested if else
			if(num2>num3) {
				System.out.println(num2 + " is the greatest number");
			}
			else {
				System.out.println(num3 + " is the greatest number");
			}
		}
		
		/*
		 * if(num1>num2 && num1>num3) {
		 * System.out.println(num1 + " is the greatest number");
		 * }
		 * else if(num2>num1 && num2>num3) {
		 * System.out.println(num2 + " is the greatest number");
		 * }
		 * else {
		 * System.out.println(num3 + " is the greatest number");
		 * }
		 */
	}

}
