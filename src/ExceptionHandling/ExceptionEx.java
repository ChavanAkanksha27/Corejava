package ExceptionHandling;

public class ExceptionEx {

	public static void main(String[] args) {
		
		try 
		{
		int[] numbers = {1, 2, 3};
		System.out.println(numbers[50]);
		} 
		catch (Exception e) 
		{
		System.out.println(e);

	}
		finally {
			System.out.println("The finally statement lets you execute code, after try...catch," +"regardeless of the result");
		}
	}

}
