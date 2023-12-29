// Write a program to create a calculator using switch statement.

package practice;

import java.util.Scanner;

public class Calculator {

	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Calculator");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");
	        System.out.print("Enter your choice (1/2/3/4): ");
	        
	        int choice = sc.nextInt();
	        
	        System.out.print("Enter the first number: ");
	        double num1 = sc.nextDouble();
	        
	        System.out.print("Enter the second number: ");
	        double num2 = sc.nextDouble();
	        
	        double result;

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case 2:
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case 3:
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case 4:
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Error! Division by zero.");
	                }
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }
	    }
	}

