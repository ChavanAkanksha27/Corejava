package Basicprogram;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		
		//using loop
		String rev="";
		for(int i=0; i<=s.length()-1;i++){
			System.out.println(s.charAt(i));
			rev=s.charAt(i)+rev;
	    }	
		System.out.println(rev);
			
		//using stringBuilder
		StringBuilder s1= new StringBuilder(s);
		StringBuilder rev1=s1.reverse();
		System.out.println(rev1);
		
		//using to charArray
		char[] arr=s.toCharArray();
		System.out.print("**");
		System.out.println(arr);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		
		
		
		}
	
	
	}


