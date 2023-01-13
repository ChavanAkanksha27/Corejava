package Basicprogram;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//operator 1
		int x = 5;
		int y = 7;
		int z = 10;
		
		++y;
		x++;
		System.out.println("post-increment operator is:"+x);
		System.out.println("pre-increment operator is:"+y);
		System.out.println("shift oprator is:"+(z>>2));
		
		
		//operator 2
		
		int a = 20;
		int b = 10;
		System.out.println("a & b = "+(a & b));
		System.out.println("a | b = "+(a | b ));
		System.out.println("a ^ b = "+(a ^ b));
		if((a > b) && (b < a))
		{
		System.out.println("logical operator:"+a);
	
	}
		
		//Operator 3
		
		int a1= 3;
		String result=a1%2==0 ? "even" : "odd";
		System.out.println("result:"  
		+result);
		int x1 = 4;
		int y1 = 6;
		String result1 = (y1 > x1) ?  "y is greater" :  "x is greater" ;   //true : false
		System.out.println("result1 is:" +result1);
		String s = "Sakshi";
		String s1 = new String("Sakshi");
		System.out.println("output is:" +s);
		System.out.println("output is:" +s1);
	
	
	}
}
