package com.hibernate.student;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDaoImpl implements StudentDao {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addStud() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String studName, course;
		long phone;
		
		System.out.println("Enter the Name: ");
		studName = sc.nextLine();
		
		System.out.println("Enter the Course: ");
		course = sc.next();
		
		System.out.println("Enter the Phone Number: ");
		phone = sc.nextLong();
		
		Student2 std = new Student2();
		std.setStudName(studName);
		std.setCourse(course);
		std.setPhone(phone);
	
		
		session.save(std);
		tx.commit();
		session.close();
		System.out.println("Student added successfully");
	}

	@Override
	public void deleteStud() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.print("Enter the student id to delete: ");
		int studId = sc.nextInt();
		
		Student2 stdToDelete = session.get(Student2.class, studId);
		if(stdToDelete != null) {
			
			session.delete(stdToDelete);
			tx.commit();
			System.out.println("Student with Id " + studId + " has been deleted.");
		}
		else 
			System.out.println("Student with Id " + studId + " not found.");
	
		session.close();
	}

	@Override
	public void updateStud() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.print("Enter the student id to update: ");
		int studId = sc.nextInt();
		
		Student2 stdToUpdate = session.get(Student2.class, studId);
		if(stdToUpdate != null) {
			
			boolean isUpdating = true;
			while(isUpdating) {
				System.out.println("Select the field to update: ");
				System.out.println("1. Name: ");
				System.out.println("2. Course: ");
				System.out.println("3. Mobile Number: ");
				System.out.println("4. Exit ");
				
				int choice = sc.nextInt();
				sc.nextLine(); // consume newline
				
				switch (choice) {
			
				case 1:
					System.out.print("Enter the name: ");
					String name = sc.nextLine();
					stdToUpdate.setStudName(name);
					break;
					
				case 2:
					System.out.print("Enter the course: ");
					String course = sc.nextLine();
					stdToUpdate.setCourse(course);
					break;
					
				case 3:
					System.out.print("Enter the phone number: ");
					long phone = sc.nextLong();
					stdToUpdate.setPhone(phone);
					break;
					
				case 4:
					isUpdating = false;
					break;
				
				default:
					System.out.print("Invalid choice. Please select a valid option. ");
					break;
				}
			}
			session.update(stdToUpdate);
			tx.commit();
			System.out.println("Student with Id " + studId + " has been updated.");
		}
		else 
			System.out.println("Student with Id " + studId + " not found.");
	
		session.close();
	}

	@Override
	public void getStud() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Student2> student = session.createQuery("FROM Student2", Student2.class).list();
		session.close();
		
		System.out.println("Employee List: ");
		for(Student2 std: student) {
			
			System.out.println("Student Id: " + std.getStudId());
			System.out.println("Name: " + std.getStudName());
			System.out.println("Course: " + std.getCourse());
			System.out.println("Mobile Number: " + std.getPhone());
		}
	}
}
