package CodingQustions;

public class Q5_ABCD_patterns {
	public static void main(String[] args) {
		char ch = 'A';
		
		for(int i =0 ; i <5 ; i++) {
			for(int j = 0; j< 5; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

}
