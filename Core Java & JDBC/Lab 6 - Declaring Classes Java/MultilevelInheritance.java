package inheritance;
/*
 * Write a program to demonstrate multilevel inheritance
 */
class Employee{
	
	int empid;
	String company;
	
	public void markAttendance() {
		
		System.out.println("Your attendance has been marked");
	}
}

class Programmer extends Employee{
	
	String category;
	
	public void coding() {
		
		System.out.println("The programmer is coding as a " + category + 
				" programmer");
	}
}

class JavaDeveloper extends Programmer{
	
	String designation;
	String project;
	
	public void usingHibernate() {
		
		System.out.println("Java developer is using hibernate to create "
				+ "application");
	}
	
	// alt + shift + s
	@Override 
	public String toString() {
		return "JavaDeveloper [designation=" + designation + ", project="
	+ project + ", category=" + category + ", empid=" + empid + ", company=" +
		company + "]";
	}
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		JavaDeveloper jd = new JavaDeveloper();
		jd.empid = 101;
		jd.company = "Accenture";
		jd.category = "Junior";
		jd.designation = "Intern";
		jd.project = "Data Management";
		
		jd.markAttendance();
		jd.coding();
		jd.usingHibernate();
		
		System.out.println("Printing the details of this java developer");
		System.out.println(jd);
	}

}
