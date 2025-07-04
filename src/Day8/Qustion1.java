package Day8;

import java.util.Scanner;

public class Qustion1 {
	
	static int fact(int n) {
		if(n == 0) return 1;
		
		int sum = 1;
		
		for(int i = 1; i <= n ; i++) {
			sum *= i;
		}
		
		return sum;
	}
	
	static boolean isNumStrong(int num) {
		int temp = num, sum = 0;
		while(num != 0) {
			int d = num%10;
			sum += fact(d);
			num /= 10;
		}
		
		if(temp == sum) return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		
		if(isNumStrong(number)) {
			System.out.println("the number " + number + " is strong number");
		}else {
			System.out.println("the number " + number + " is not a strong number");
		}
		
		sc.close();
	}

}
