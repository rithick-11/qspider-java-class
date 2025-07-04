package CodingQustions;

import java.util.Scanner;

public class Q3Nto1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int n = sc.nextInt(), sum =0;
		
		for(int i = n ; i > 0 ; i--) System.out.println(i);
		
		sc.close();
	}
  
}
