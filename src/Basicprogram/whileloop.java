package Basicprogram;



public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum of digit
		int num=7, sum=0;	
			while(num>0) {
			sum=0;
			int rem= num%10;
			sum = sum + rem;
			num= num/10;
			
			}
			System.out.println("sum of digit:"+sum);
		}
		
}