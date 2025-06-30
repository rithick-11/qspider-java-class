package Dev;

import java.util.Scanner;

public class VowelsAndConstants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char :");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				{
					System.out.println("Is Vowel char");
					break;
				}
				
			default:
				{
					System.out.println("not a vowel");
				}
		}
	}
}
