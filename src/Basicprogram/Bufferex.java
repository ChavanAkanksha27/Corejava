package Basicprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bufferex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println(" my name is:" +name);
        int b = Integer.parseInt(br.readLine());
        System.out.println(" my name is:" +b);
		
		
	}

}
