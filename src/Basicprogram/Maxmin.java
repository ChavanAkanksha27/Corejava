package Basicprogram;

public class Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int a  = 5;
	        int b = 3;
	        
	        int result = a>b? a:b;
	        System.out.println("max:"+result);
	        
	        int c = 2;
	        int res =(a>b) ?(a>c?a:c) : (b>c?b:c);
	        System.out.println("max:"+res);

	}

}
