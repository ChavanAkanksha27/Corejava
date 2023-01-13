package Opps;



 class Bike1
 {
	String bname;
//	abstract void speed();
	void display() {
		System.out.println("Bike1 class.---Parent class");
	}
}

class MotorBike1 extends Bike1{
	
	int speed;
	@Override
	void display() {
		System.out.println("MotorBike1 class--child class");
	}
	
	void speed1() {
		System.out.println("Motorbike speed ");
	}

	
	
}

 	

public class UpDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bike1 b= new MotorBike1(); //upcating----> Child to parent (done implicitly)
//		 
			b.bname= "BMW";
			System.out.println("Bike Name " + b.bname);
			b.display();
			MotorBike1 m = (MotorBike1) b;  //downcasting---> Parent to child( done explicitly)
			m.speed = 100;
			System.out.println("bike name->" +m.bname);
			System.out.println("bike speed->" +m.speed);
			m.display();

	}
}
