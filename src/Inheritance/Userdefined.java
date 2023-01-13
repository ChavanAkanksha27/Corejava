package Inheritance;

import java.util.Scanner;


class Addition{
	int a,b;
	Scanner s =new Scanner(System.in);
	
	void add()
	{
		System.out.println("value of a and b:");
		a=s.nextInt();
		b=s.nextInt();
		 int sum=a+b;
		 
		 System.out.println("sum is:"+sum);
				
	}
	
}

 class Subtract extends Addition
 {

int a,b;
Scanner s =new Scanner(System.in);

void sub()
{
	System.out.println("value of a and b:");
	a=s.nextInt();
	b=s.nextInt();
	 int sub=a-b;
	 
	 System.out.println("sub is:"+sub);
			
}

}

public class Userdefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subtract s=new Subtract();
		s.add();
		s.sub();
		
		
		
	}

}

