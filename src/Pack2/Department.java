package Pack2;
import java.util.Scanner;

import Pack1.Employee;


public class Department  {

	public Department(int no, String nm) {
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter eno and ename");
		int a = s.nextInt();
		String s1= s.nextLine();
		    Employee e = new Employee(a, s1);
		    e.display();
	}

}
