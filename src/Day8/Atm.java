package Day8;

class ATM1{
	private int money;
	
	public ATM1(){}
	
	public ATM1(int money) {
		this();
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void deposit(int amount) {
		this.money += amount;
		System.out.println("amount deposted successfully");
	}
	
	void withdraw(int amount) {
		if(this.money >= amount) {
			this.money -= amount;
			System.out.println("Amount withdraw successfull");
		}else {
			System.out.println("inefficient balance!!");
		}
	}
}

public class Atm {
	
	public static void main(String[] args) {
		ATM1 user = new ATM1();
		user.setMoney(5000);
		
		System.out.println(user.getMoney());
		user.withdraw(6000);
		System.out.println(user.getMoney());
		user.deposit(2000);
		System.out.println(user.getMoney());
		user.withdraw(6000);
		System.out.println(user.getMoney());
	}

}
