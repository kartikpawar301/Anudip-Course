 package practice;

import java.util.Scanner;

public class AreaofCircle { 

	public static void main(String[] args) {
		
		System.out.print("Enter the radius of circle:");
		Scanner sc =new Scanner(System.in);
		double radius = sc.nextDouble();	
		
		double area = 3.14 * radius *radius;
		System.out.print("The area of circle is:" + area);		 
  
	}

}








