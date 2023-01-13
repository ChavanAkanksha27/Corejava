package ExceptionHandling;
import java.util.Scanner;

class InvalidMarksException extends Exception{
	String s;
	public InvalidMarksException(String s) {
		this.s=s;
		
	}
	@Override
	public String toString() {
		return "InvalidMarksException [s=" + s + "]";
	}
	
}


public class ExceptionDemo1 {
	static void markchecker(int m) throws InvalidMarksException{
		if(m<0 || m>100) {
			throw new InvalidMarksException("Invalid Marks");
		}
		else {
			System.out.println("Valid Marks.");
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enet your marks");
		int m=sc.nextInt();
		try {
			markchecker(m);
			
		}
		catch(InvalidMarksException e) {
			System.out.println(e.toString());
		}
		

	}

}
