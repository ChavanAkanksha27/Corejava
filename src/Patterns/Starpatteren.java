package Patterns;
import java.util.Scanner;
public class Starpatteren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner ob = new Scanner(System.in);
//		 System.out.println("Enter the num to print");
//		 int n = ob.nextInt();
//		 
//		 for(int i =1; i<=n; i++)  //row
//		 {
//			 
//			 
//			for(int j=1; j<=i; j++)   //col
//			 {
//				 
//				System.out.print(j);
//			 }
//			 System.out.println();
//		 }
		 
		//A
		//AB
		//ABC
		//ABCD
		//ABCDE
		
//		 
//		 Scanner sc3 = new Scanner(System.in);
//		 System.out.println("Enter the no of rows");
//		 int n3 = sc3.nextInt();
//		 int alphabet = 65;
//		 for (int i =0; i<=n3-1; i++)
//		 {
//			 for (int j=0; j<=i; j++)
//				 
//			 {
//				 System.out.print((char)(alphabet + j)+ "");
//				 
//			 }
//			 System.out.println();
//		 }
		 
		 //Right star triangle
		 
		
         int rows = 7;
        
        for(int j=1;j <= rows;j++){
            for(int i=1; i <= rows-j; i++){
                System.out.print("  ");
            }
            
            for(int k=1;k<=j; k++){
                System.out.print("* ");
            }

            System.out.println();

	}

}
}
