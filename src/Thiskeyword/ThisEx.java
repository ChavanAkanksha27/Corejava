package Thiskeyword;

public class ThisEx {
	
	
	String name;
	int num;
	
//	public Thisex(String name) {
//		super();
//		this.name= name;
//		System.out.println("Name is: "+this.name); //Get same value using this 
//	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisEx t=new ThisEx();
		t.setName("ABC");
		System.out.println("Object t "+t.name);

	}

	

}
