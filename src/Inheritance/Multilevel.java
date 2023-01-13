package Inheritance;


class Car{
	public Car()
	{
		System.out.println("class car");
		
	}
	public void vehicleType()
	{
		System.out.println("vehicle Type is : car");
	}
}


class Tata extends Car {
	public Tata()
	{
		System.out.println("class Tata");
		
	}
	
	public void brand() {
		System.out.println("Brand is: Tata");
		
	}
	
	public void speed()
	{
		System.out.println("maximum speed is: 80kmph");
		
	}
}


 class Maruti extends Tata{
	
	public Maruti()
	{
		System.out.println("Class is : Maruti ");
		
	}
	
	public void brand() {
	   System.out.println("Brand is: Maruti");
		
	}
	
	public void speed()
	{
		System.out.println("maximum soeed is: 80kmph");
		
	}
}



public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maruti obj=new Maruti(); 
		obj.vehicleType();
		obj.brand();
		obj.speed();
		
	}

}
