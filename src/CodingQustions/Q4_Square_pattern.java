package CodingQustions;

import java.util.Scanner;

public class Q4_Square_pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number n and m: ");
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 0 ; j< m ; j++) {
				if(i == 0 || j == 0 || i == n-1 || j == m-1) System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}

	}

}
