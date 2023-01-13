package Basicprogram;

public class Nestedprg {
	public static void main (String[]args) {
	int marks = 0;
	
	  if(marks>0 && marks<50 ) {
	     System.out.println("fail");
	  }
	  else if(marks>50 && marks<60) {
		  System.out.println("D grade");
		  
	  }
	  else if(marks>60 && marks<70) {
		  System.out.println("B grade");
		  
	  }
	  else if(marks>70 && marks<80) {
		  System.out.println("A grade");
	  
		  
	  } else if (marks>=80 && marks<90) {
			System.out.println("A + Grade");
			
	  }else if (marks>=80 && marks<90) {
				System.out.println("A + Grade");
		  
	  }else {
			  System.out.println("Invalid!");
			  
			  
			  int num = -1;
			  if(num>0)
			  {
				  System.out.println("number is positive");
				  
			  }
			  else if (num<0)
			  {
				  System.out.println("number is negative");
				  
			  }
			  else if (num == 0) {
				  System.out.println("number is 0");
				  
			  }
			
		  }
		  }

}

