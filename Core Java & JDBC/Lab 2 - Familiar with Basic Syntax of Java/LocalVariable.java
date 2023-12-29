package practice;

public class LocalVariable {
	
	public void display() {
		
		int num = 78;
		System.out.println("Number is:" + num);
	}
	
	{
		String name = "Kartik Pawar";
		System.out.println("Name is:" + name);
	}

	public static void main(String[] args) {
		
		LocalVariable lvp = new LocalVariable();
		lvp.display();
	}

}
