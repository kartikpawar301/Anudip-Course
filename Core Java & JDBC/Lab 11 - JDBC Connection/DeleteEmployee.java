package zpracticals.lab11;

// 1) Write a program to demonstrate the use of PreparedStatement to delete an employee from the employee table based on the id given by user.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {

    public static void main(String[] args) {
    	
    	try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/Anudip_db?user=root&password=aish@2001";
			
			Connection con=DriverManager.getConnection(url);
			String sql="DELETE FROM employee_honda WHERE empId = ?";
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the employee ID to delete: ");
            int empId = sc.nextInt();
            sc.nextLine();
			
            PreparedStatement ps=con.prepareStatement(sql); 
			ps.setInt(1, empId);
			
			int i=ps.executeUpdate();
			
			if(i>0)
				System.out.println("Employee with ID="+empId+" deleted successfully!!!");
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
    }
}
