package Basicprogram;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
//		int num = 1245, orinum, rem, result = 0, n=0;
//
//         orinum = num;
//
//        for (;orinum != 0; orinum /= 10, ++n);
//
//        orinum = num;
//
//        for (;orinum != 0; orinum /= 10)
//        {
//            rem = orinum % 10;
//            result += Math.pow(rem, n);
//        }
//
//        if(result == num)
//            System.out.println(num + " is an Armstrong number.");
//        else
//            System.out.println(num + " is not an Armstrong number.");
	
	
	//Armstrong for 3 numbers
	
	int num=445, originalnumber, rem, result=0 ;
	originalnumber = num;
	
	while(originalnumber !=0)
	{
		rem = originalnumber % 10;
		result += Math.pow(rem, 3);
		originalnumber /=10;
		
	}
	
	if(result == num)
		System.out.println(num +  " is an armstrong.");
	else
		System.out.println(num +  " is not an armstrong.");
				
		
	


		}
}

