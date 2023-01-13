package Opps;

public class Methodoverloadprg {
	
   int sum(int a, int b) {
		
		int sum = a+b;
		return sum;
	}
	float add1(int w, float d) {
		float add =(w+d);
		return add;
		
	}
	float add(float f, float g) {
		float add =(f+g);
		return add;
	}
	void sub(int a, int b)
	{
		System.out.println("sub" +(a-b));
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Methodoverloadprg p1 = new Methodoverloadprg();
		Methodoverloadprg p2 = new Methodoverloadprg();
		p2.sub(5, 4);
		
		int a= p1.sum(2,3);
		System.out.println("sum is :" +a);
		Methodoverloadprg p3 = new Methodoverloadprg();
		
		float d = p3.add(4, 7.8f);
		System.out.println("sum is:" +d);
		Methodoverloadprg p4 = new Methodoverloadprg();
		float d1 = p4.add(5.6f , 4);
	
	}

}
