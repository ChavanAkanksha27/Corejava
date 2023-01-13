package Pack1;
class PrivateClass{
	private int a = 15;
	
	private void display() {
		System.out.println("Private variable" +a);
		
	}
}
public class Privatedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateClass p= new PrivateClass();
//		System.out.println(p.a);
//		p.display();       //scope of private class
		
	}

}
