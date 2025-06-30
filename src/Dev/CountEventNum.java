package Dev;
import java.util.Scanner;

public class CountEventNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int number = sc.nextInt(), count=0;
		
		while(number != 0) {
			int n = number%10;
			if(n%2 == 0) count++;
			number /= 10;
		}
		
		System.out.println("Count of even number is "+count);
		
		
		sc.close();
	}

}
