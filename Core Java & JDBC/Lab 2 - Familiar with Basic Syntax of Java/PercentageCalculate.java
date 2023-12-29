package practice;

import java.util.Scanner;

public class PercentageCalculate {
	
	public static void main(String[] args) {
		
		System.out.print("Enter Your Marks Out of 500:");
		
		Scanner sc = new Scanner(System.in);
		float marks = sc.nextInt();
		
		float percentage = (marks / 500) * 100;
		System.out.print("Percentage is:" + percentage);
	}

}
