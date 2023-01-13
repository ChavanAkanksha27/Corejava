package ExceptionHandling;

public class ThrowException {
	static void Age(int age) {
	if(age<18)
	{
		throw new ArithmeticException("Accessed denied must be at least 18 yrs old to watch movie");
		
	}
	else {
		System.out.println("Access granted");
	}
}
	
public static void main(String[] args) {
		Age(14);
	}
}


