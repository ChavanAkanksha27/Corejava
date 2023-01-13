package Opps;

public class Methodoverloading {
	
int  add(int a, int b) {
	return(a+b);
}
int  add(int a) {
	return(a++);
}

int  add(int a, int b, int c) {
	return(a+b+c);
}


void sub(int a, int b) {
	System.out.println(a-b);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading m= new Methodoverloading();
		
		
		int a=m.add(5,5);
		System.out.println(a);
		 
		System.out.println(m.add(5,5));
		
		m.sub(5,2);
		
		System.out.println("one  para:"+m.add(5));
		System.out.println("two  para:"+m.add(5,6));
		System.out.println("three  para:"+m.add(5,6,7));
		
		
	}

}
