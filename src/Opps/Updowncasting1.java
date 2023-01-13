package Opps;
public class Updowncasting1 
{ 
   int x = 20; 
   double y = 40.5; 
   long p = 30; 
   float q = 10.60f; 
void sum() 
{ 
 // int z = x + y; (1) // Error; cannot convert from double to int. 
    double z = x + y; 
 
   System.out.println("Sum of two numbers: " +z); 
 } 
void sub() 
{ 
 // long r = p - q; // (2) // Error; cannot convert from float to long. 
    float r = p - q; 
    System.out.println("Subtraction of two numbers: " +r); 
  } 

public class ExplicitTest 
{ 
   double d = 100.04; 
  void conversion() 
  { 
// explicit type casting 
    long l = (long)d; 
    int i = (int)l; 
  System.out.println("Double value "+d); // fractional part lost. 
  System.out.println("Long value "+l); // fractional part lost. 
  System.out.println("Int value "+i); 
} 
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Updowncasting1 obj = new Updowncasting1(); 
	    obj.sum(); // Calling sum method. 
	    obj.sub(); // Calling sub method. 
	  } 
	
	
	{ 
		   ExplicitTest obj = new ExplicitTest(); 
		    obj.conversion(); 
		  } 
}
	



