package Pack1;
class DefaultClass{    //Parent class
	int a = 13;
	
	void display() {
		System.out.println("Default class variable " +a);
	}
	
}

class DefaultSub extends DefaultClass{     //sub class
	void displaySub() {
		System.out.println("Default class variable" );
	}
}
public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		DefaultSub d = new DefaultSub();
		d.display();
		d.displaySub();
	}

}
