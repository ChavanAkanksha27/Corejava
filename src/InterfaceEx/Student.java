package InterfaceEx;

public class Student {
	
	String name;
	int rollno, Marks1, Marks2;
	Student(String n, int rno, int m1, int m2){
		name= n;
		rollno= rno;
		Marks1= m1;
		Marks2= m2;
		
	}

	void show() {
		
		System.out.println("student name: "+name);
		System.out.println("roll no: "+rollno);
		System.out.println("Marks1: "+Marks1);
		System.out.println("Marks2: "+Marks2);
		
		
		
	}
	
	


}
