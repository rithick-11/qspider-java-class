package Week1Practice;

public class Spending {

	public static void main(String[] args) {
		int walletAmount = 5000, groceries = 1200, fuel = 800, shopping = 500,  remainingAmount;
		remainingAmount = walletAmount - (groceries - fuel - shopping);
		System.out.println("Balance Amount :" + remainingAmount);
	}

}
