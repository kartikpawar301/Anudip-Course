/*
 *  Write a program switch for taking a user input for an icecream flavour 
 *  and print the cost of that icecream.
 */

package practice;

import java.util.Scanner;

public class IcecreamFlavour {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select an ice cream flavor:");
        System.out.println("1. Vanilla");
        System.out.println("2. Chocolate");
        System.out.println("3. Strawberry");
        System.out.println("4. Butterscotch");
        System.out.print("Enter your choice (1/2/3/4): ");
        
        int choice = sc.nextInt();
        
        double cost;
        
        switch (choice) {
            case 1:
                cost = 2.0; // Cost of Vanilla ice cream
                break;
            case 2:
                cost = 2.5; // Cost of Chocolate ice cream
                break;
            case 3:
                cost = 3.0; // Cost of Strawberry ice cream
                break;
            case 4:
                cost = 3.5; // Cost of Butterscotch ice cream
                break;
            default:
                System.out.println("Invalid choice. Please select a valid flavor.");
                return;
        }
        
        System.out.println("The cost of your ice cream is $" + cost);
    }
}
