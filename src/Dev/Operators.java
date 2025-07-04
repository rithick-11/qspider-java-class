package Dev;

public class Operators {

	public static void main(String[] args) {
		int a=102, b = 90, c=30;
		if(a > b && a > c) {
			if(a%2 == 0) {
				System.out.println("a is greater and even");
			}else {
				System.out.println("a is greater but not even");
			}
		}
		else if ( b > c) {
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
	}

}
