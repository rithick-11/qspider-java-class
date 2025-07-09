package Dev;

import java.util.Scanner;

public class Prg02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5] ;
		int sum =0;
		
		for(int i =0; i < 5; i++) {
			System.out.println("Enter student "+ (i+1));
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		System.out.println("the avg of 5 is " + sum/5);
		
		sc.close();
	}
}
