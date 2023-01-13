package ExceptionHandling;


public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			int a= Integer.parseInt(null);
			System.out.println("a"+a);
			
			int b= Integer.parseInt("Hii");
			System.out.println("b"+b);
			
			int c= Integer.parseInt("90");
			System.out.println("c"+c);
	
		}
		catch(Exception e){
			System.out.println(e);
			
		}

	}

}
