package Inheritance;


class Emp{
	String ename= "Akanksha";
	int eno;
	Emp(int eno){
		this.eno=eno;
	}
	void display() {
		System.out.println("Employee class."+eno);
	}
}

class Dept extends Emp{
	String ename="xyz";
	Dept(){
		super(19);
		
	}
	void display() {
		
	   super.display();
		System.out.println("Department class."+super.ename);
	
}
}
public class Methodoverridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept d=new Dept();
		d.display();
//		Emp e=new Emp();
//		e.display();
	}
}

