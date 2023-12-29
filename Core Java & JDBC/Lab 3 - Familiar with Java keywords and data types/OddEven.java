//1) Write a program to take a number from user. Check if the number is even or odd.
package practice;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("This is even number");
		}
		else {
			System.out.println("This is odd number");
		}

	}

}
