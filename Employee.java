import java.util.*;
class employee{
	private int empno,basic;
	private String ename;
	private double bonus;	
	// constructor
employee(int eno,int ba,String enam){
	empno=eno;
	basic=ba;
	ename=enam;
	}
public void calc() {
	bonus=10.0/100*basic;
}
public void dispdata() { 
	for (int i=0;i<30;i++)
		System.out.print("*");
	System.out.println("\nEmployee no\t:"+empno);
	System.out.println("Employee name\t:"+ename);
	System.out.println("Basic salary\t:"+basic);
	System.out.print("Bonus \t:"+bonus+"\n");
	for (int i=0;i<30;i++)
		System.out.print("*");
	System.out.print("\n");
	}
}
public class Employee {
	public static void main(String[] args)  {
		int eno,ba,n;
		String enam;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter how many employees :");
		
		n = Integer.parseInt(s.nextLine());
	    employee[] e = new employee[n];
	    for(int i=0;i<n;i++) { 
	    	System.out.print("Enter the employee's number:");
	    	eno = Integer.parseInt(s.nextLine());
			System.out.print("Enter the basic salary :");
			ba = Integer.parseInt(s.nextLine());			
			System.out.print("Enter the employee's name :");
			enam=s.nextLine();
		// Initializing objects through parameterised constructor
			e[i]=new employee(eno,ba,enam);
	    }
	   	   	
	    for(int i=0;i<n;i++) { 	
	   	e[i].calc();
		e[i].dispdata();
	    }
		
	}
}