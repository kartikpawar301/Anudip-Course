package com.hibernate.student;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	char a;
        StudentDaoImpl daoImpl = new StudentDaoImpl();
        do {
        	
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Student Registration");
        	System.out.println("1. Add Student");
        	System.out.println("2. Show Student");
        	System.out.println("3. Delete Student");
        	System.out.println("4. Update Student");
        	System.out.print("Enter the choice: ");
        	int ch = sc.nextInt();
        	switch (ch) {
        	
			case 1:
				daoImpl.addStud();
				break;
				
			case 2:
				daoImpl.getStud();
				break;
				
			case 3:
				daoImpl.deleteStud();
				break;
	
			case 4:
				daoImpl.updateStud();
				break;

			case 5:
				System.exit(0);
				break;
				
			}
        	System.out.print("Do you want to continue Y/N: ");
			a = sc.next().charAt(0);
			
        }
        while(a=='Y' || a=='y');
        System.out.println("Thanks");
    }  
}
