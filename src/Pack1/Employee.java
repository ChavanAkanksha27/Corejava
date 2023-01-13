package Pack1;





public class Employee {
	int eno;
	String ename;
	
	
	public Employee(int no, String nm) {
		eno= no;
		ename = nm;
		
	}

	public void display(){
		// TODO Auto-generated method stub
		System.out.println("Employee details:" +eno +"\t" +ename);
	}

}
