package Opps;

abstract class Bike{
	String bname;
	abstract void speed();
	void display() {
		System.out.println("Bike class.");
	}
}

class MotorBike extends Bike{
	
	int speed;

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Motor Bike");
	}
	
}

abstract class SpeedBike extends Bike{   //if the subclass is declared abstract, it's not mandatory to override abstract methods


//	@Override
//	void speed() {
//		// TODO Auto-generated method stub
//		System.out.println("Speed Bike");
//	   }     
	
}


public class AbstractEx extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b= new SpeedBike() {  //Upcasting
			
			@Override
			void speed() {
				// TODO Auto-generated method stub
				System.out.println("Speed Bike.");
			}
		};
		b.speed();
		b.bname= "BMW";
		System.out.println("Bike Name" + b.bname);
//		Bike b= new Bike();  //we cannot creat object in abstract class
		Bike a= new AbstractEx();
		a.display();
		a.speed();
		MotorBike m= (MotorBike)b;
		m.speed= 120;
		System.out.println("bike name" +m.speed);
		m.speed();
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Nice Bike. ");
	}

}

	
