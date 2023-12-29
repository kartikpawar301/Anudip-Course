package practice;

import java.util.Scanner;

public class Method {
	
	public String display() {
		
		System.out.print("Enter Your Name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		return name;

	}

	public static void main(String[] args) {
		
		Method mp = new Method();
		
		String nm = mp.display();
		System.out.println("Hello " + nm + " Welcome to this java session");
		
	}

}
