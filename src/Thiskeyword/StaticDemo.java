package Thiskeyword;

 class StaticDemo1 {
	 static int a,b;
	 static String n;
	 static void display() {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(n);
	 }
 }
	 public class StaticDemo{
		 
	 
	public static void main(String[] args) {
		StaticDemo1.a=10;
		StaticDemo1.b=15;
		StaticDemo1.n="ABC";
		StaticDemo1.display();
				

	}

}
