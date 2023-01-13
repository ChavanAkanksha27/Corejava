package Inheritance;

class Student 
{
	int Minu = 10;
	void display() {
		System.out.println("Roll no is :" +Minu);
		
	}
	
}  ///end of parent class

class EngineerStu extends Student{
	String space="Computer Eng";
	void displayinfo() {
	}
}

public class SingleInheritance {
	
	
		
	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		EngineerStu e=new EngineerStu();
		
		e.display();
		
		e.displayinfo();
		
			
		}

	}


