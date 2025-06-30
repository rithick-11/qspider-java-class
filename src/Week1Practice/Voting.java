package Week1Practice;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		int age; boolean isEligible;
		
		Scanner sc = new Scanner(System.in);
		
		age = sc.nextInt();
		
		isEligible = age >= 18;
		
		System.out.println(isEligible);
	}

}
