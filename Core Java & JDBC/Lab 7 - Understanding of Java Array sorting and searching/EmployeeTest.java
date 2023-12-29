package com.mini.ui;

import java.util.Arrays;
import java.util.Scanner;

import com.mini.dao.EmployeeDaoImpl;
import com.mini.pojo.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("********** Welcome to SocialEmp **********");
		
		boolean exit = false;
		boolean flag;
		int empId = 101;
		String empName;
		String designation;
		double salary;
		
		Employee e = null;
		EmployeeDaoImpl eimpl = new EmployeeDaoImpl();
		
		while(exit == false) { // same as while(!exit)
			System.out.println("\nPlease enter the number as given in option...");
			System.out.println("1 ----------> Register employee");
			System.out.println("2 ----------> Show all employees");
			System.out.println("3 ----------> Search employee by id");
			System.out.println("4 ----------> Update employee details");
			System.out.println("5 ----------> Delete employee details");
			System.out.println("6 ----------> Exit");
			
			int option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			case 1:
				System.out.println("Enter your name: ");
				empName = sc.nextLine();
				
				System.out.println("Enter your designation: ");
				designation = sc.nextLine();
				
				System.out.println("Enter your salary: ");
				salary = sc.nextDouble();
				sc.nextLine();
				
				empId += 0;
				
				e = new Employee(empId, empName, designation, salary);
				flag = eimpl.addEmployee(e);
				if (flag) {
					
					System.out.println("Employee registered successfully!!!");
					System.out.println(Arrays.toString(eimpl.showAllEmployees()));
				} 
				else
					System.err.println("Error while adding employee!!!");
				
				break;
				
			case 2:
				System.out.println("Showing all employees...");
				System.out.println(Arrays.toString(eimpl.showAllEmployees()));
				break;
				
			case 3:
				System.out.print("Enter th id of employee to be searched: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				e = eimpl.searchEmployeeById(id);
				
				if(e!=null) {
					
					System.out.println("The employee found with given id:-\n" + e);
				}
				else {
					
					System.out.println("Sorry we could not find any employee with this id");
				}
				break;
				
			case 4:
				break;
				
			case 5:
				System.out.println("Enter the Id of employee to be deleted: ");
				id = sc.nextInt();
				sc.nextLine();
				
				flag = eimpl.deleteEmployee(id);
				if(flag) {
					
					System.out.println("Employee deleted successfully.");
				}
				else
					System.out.println("Error while deleting employee.1");
				break;
				
			case 6:
				exit = true;
				System.out.println("Thank You Visit Again...");
				break;
			}
		}
	}
}