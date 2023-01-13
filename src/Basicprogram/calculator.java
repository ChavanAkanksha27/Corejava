package Basicprogram;

import java.util.*;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,res;
		char choice, ch;
		Scanner S= new Scanner(System.in);
		
		do
		{
			System.out.println("\n\nMain menu :\n1.Addition\n2.subtraction\n3.division\n4.Multiplication\n5.exit\n");
			System.out.println("Enter an operator:");
			
			choice =S.next().charAt(0);
		
			
			switch (choice)
			{
			case '1': System.out.println("Enter  two number:");
			a=S.nextFloat();
			b=S.nextFloat();
			res=a+b;
			System.out.println("Result:" +res);
			break;
			
			
			case '2':System.out.println ("Enter  two number:");
			a=S.nextFloat();
			b=S.nextFloat();
			res=a-b;
			System.out.println("Result:" +res);
			break;
			
		
			
			
			case '3': System.out.println("Enter  two number:");
			a=S.nextFloat();
			b=S.nextFloat();
			res=a/b;
			System.out.println("Result:"+res);
			break;
		
			case '4': System.out.println("Enter  two number:");
			a=S.nextFloat();
			b=S.nextFloat();
			res=a*b;
			System.out.println("Result:"+res);
			break;
			
			case '5': 
			System.exit(0);
			break;
			default: System.out.println("wrong choice....\n");
			break;
			}	
			
	}
		while(choice!=5);
}
}


