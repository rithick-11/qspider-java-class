package CodingQustions;

import java.util.Scanner;

public class Q6_Strong_Number {
	
	static int fact(int n) {
		if(n == 0) return 1;
		
		int sum = 1;
		
		for(int i = 1 ; i <= n ; i++) sum *= i;
		
		return sum;
	}
	
	static boolean isStrongNumber(int num) {
		int temp = num, sum = 0;
		
		while(num != 0) {
			int d = num % 10;
			sum += fact(d);
			num /= 10;
		}
		
		return temp == sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int n = sc.nextInt();
				
		if(isStrongNumber(n)) System.out.println(n + " is strong number");
		else System.out.println(n + " is not a strong number");

	}

}
