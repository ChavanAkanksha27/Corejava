package Opps;

public class TypecastingEx {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit/widening
		byte b=20;
		int i=b;
		System.out.println(i);
		
	
	//explicit/narrowing (int-->short-->byte)
	int i1=30;
	byte b1=(byte)i1;
	System.out.println(b1);
	
//	String s="3.4";   float f-Float.parseFloat; System.out.println(f);

}
}

