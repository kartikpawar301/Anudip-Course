// Write a program to demonstrate the use of join method.

package exceptions.lab37;

class Table extends Thread  { 
	
	int num;

public Table(int num) {
	
	this.num=num;
	}

	public void run() {  
	
		for (int i=1; i<=10; i++)  {
			
			System.out.println(num+"x"+i+"="+(num*i));
			try { 
				
				Thread.sleep(1000);  
			}
			catch(InterruptedException e) {  
	
				e.printStackTrace();
			}  
		}  
	}  
}  
  
  
public class JoinMethod {

	public static void main(String[] args) throws InterruptedException  {
		
		Table t12 = new Table(12); 
		Table t20 = new Table(20); 
		Table t23 = new Table(23); 
		
		t20.start();
		t20.join();
		t12.start();
        t12.join();
		t23.start();
	}  
	
}