package ExceptionHandling;


public class Arithemetic {

	public static void main(String[] args) {
		
		try {
		int a = 4;
		int b=2;
		int c=a/b;
		int c1=4/2;
		System.out.println("value of c:" +c1);
	}
		
		catch(ArithmeticException e) 
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block");
			
		}
	}
}

