package CodingQustions;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int n = sc.nextInt(), sum =0;
		
		for(int i = 0 ; i < n ;i++) {
			if(i%2 == 0) sum += i;
		}
		
		System.out.println("Sum of event index number is " + sum);
		
		sc.close();

	}

}
