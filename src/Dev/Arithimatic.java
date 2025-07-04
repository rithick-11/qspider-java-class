package Dev;

public class Arithimatic {
	
	static int sumOfNumber(int n) {
		int sum = 0, temp;
		while(n != 0) {
			temp = n % 10;
			n /= 10;
			sum += temp;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumOfNumber(12345));
	}
}