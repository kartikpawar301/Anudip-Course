package com.mini.dao;

import com.mini.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

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
		
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		for(Employee emp:empList) {
			
			if(emp!=null) {
				
				int id = emp.getEmpId();
				if(id==empId) {
					
					Employee[] newEmpList = new Employee[empList.length];
					for(int i=0; i<empList.length; i++) {
						
						if(empList[i]!=emp) {
							
							newEmpList[i] = empList[i];
						}
					}
					empList = newEmpList;
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
				
			int id = emp.getEmpId();
			if(id==empId) {
				
				return emp;
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

	
}
