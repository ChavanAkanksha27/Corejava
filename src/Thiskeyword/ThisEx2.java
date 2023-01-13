package Thiskeyword;

public class ThisEx2 {
	int a,b;
	
//	this() is used to access one constructor from another with in the same class while 
//	super() is used to access superclass constructor. Either this() or super() exists it must be the first statement in the
//	constructor.
	
	public ThisEx2(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Before Method call " +this.a +" and " +this.b);
		multiply(this);
		System.out.println("After Method call " +this.a +" and " +this.b);
	}
	void multiply(ThisEx2 t ) {
		t.a*=5;
		t.b*=2;
		
	}
	public static void main(String[] args) {
		ThisEx2 t1=new ThisEx2(5, 6);

	}

}
