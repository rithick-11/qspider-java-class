package CodingQustions;

public class Q7_GCD_and_LCM {
	
	static int getLcm(int n, int m) {
		int start , end, ans;
		
		if(n > m) {
			start = m;
			end = n * m;
		}else {
			start = n;
			end = m * n;
		}
		
		ans = start;
		
		for(int i = start ; i <= end ; i++) {
			if(n%i == 0 && m%i == 0) ans = i;
		}
		
		return ans;
		
	}
	
	static int getGCD(int a, int b) {
		
		while(a != 0 && b != 0) {
			if(a > b) {
				a = a%b;
			}else {
				b = b%a;
			}
		}
		
		if(a == 0) return b;
		
		return a;
	}

	public static void main(String[] args) {
		System.out.println(getLcm(4, 10));
		System.out.println(getGCD(5, 1500));
	}

}
