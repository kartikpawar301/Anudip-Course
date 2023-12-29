package com.mini.dao;

import java.util.Scanner;

import com.mini.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	Scanner sc = new Scanner(System.in);
    Employee ld = new Employee();
    
	Employee[] empList = new Employee[50];
	int index=0;
	
	@Override
	public boolean addEmployee(Employee e) {
		
		if (index<50) {
			
			empList[index] = e;
			index++;
			
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee e) {
		
		for(int i=0; i<empList.length; i++) {
			
			if(empList[i].getEmpId()==e.getEmpId()) {
				
				empList[i] = e;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		for(int i=0; i<empList.length; i++) {
			
			Employee emp=empList[i];
			
			if(emp!=null) {
				
				int id=emp.getEmpId();
				
				if( id==empId) {
				
					empList[i]=null;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Employee searchEmployeeById(int empId) {
		
		for(Employee emp:empList) {
			
			if(emp!=null) {
				
			int id = emp.getEmpId(); // getting the id of the employee object received from array
			
			if(id==empId) { // checking if the object has the same id as the user given id
				
				return emp; // if they match we are returning that employee object
			}
			}
		}
		return null;
	}

	@Override
	public Employee[] showAllEmployees() {
		
		int count = 0;
		for(Employee emp:empList) {
			
			if(emp!=null) {
				
				count++;
			}
		}
		Employee[] newEmpList = new Employee[count];
		int j = 0;
		for(int i=0; i<empList.length; i++) {
			
			if(empList[i]!=null) {
				
				newEmpList[j] = empList[i];
				j++;
			}
		}
		return empList;
	}
	
	public void loginCreate() {
		
        boolean set = false;

        while(set == false) {
        	
            System.out.println("Enter user name (Must be 6 to 12 characters): ");
            ld.setUserName(sc.nextLine());

            System.out.println("Enter password (At least 8 characters, 1 upper case, 1 lower case, 1 digits, 1 special character): ");
            ld.setPassword(sc.nextLine());

            if(isValidUserName(ld.getUserName()) && isValidPassword(ld.getPassword())) {
            	
                System.out.println("Registration successful...");
                set = true;
            }
            else 
                System.out.println("Registration failed"+"\nTry again.");
        }
    }

	public boolean loginCheck(String user, String pass) {
		
		if(ld.getUserName().equals(user) && ld.getPassword().equals(pass)) 
            return true;
       
        else
            return false;
	}
	
	public boolean isValidUserName(String userName) {
		
		return userName.length() >= 6 && userName.length() <= 12;
	}
	
	public boolean isValidPassword(String password) {
		
	        boolean upperCase = false;
	        boolean lowerCase = false;
	        boolean digit = false;
	        boolean specialChar = false;

	        if(password.length() >= 8) {
	        	
	            for(char ch : password.toCharArray()) {
	            	
	                if(Character.isUpperCase(ch)) {
	                	
	                    upperCase = true;
	                }
	                else if(Character.isLowerCase(ch)) {
	                
	                    lowerCase = true;
	                }
	                else if(Character.isDigit(ch)) {
	                
	                    digit = true;
	                }
	                else {
	                
	                    String specialCharacter = "!@#$%&*-";
	                    if(specialCharacter.contains(String.valueOf(ch))) {
	                    
	                        specialChar = true;
	                    }
	                }
	            }
	        }
	        
	        return upperCase && lowerCase && digit && specialChar;
	}

	public Employee searchEmployeeByName(String name) {
		
		for(Employee emp : empList) {
			
            if(emp != null) {
            	
                if(emp.getEmpName().equalsIgnoreCase(name)) {
                	
                    return emp;
                }
            }
        }
		
		return null;
	}
}
