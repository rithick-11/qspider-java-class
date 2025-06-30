package Week1Practice;

public class BonusCal {
	public static void main(String[] args) {
		int salary = 40000;
		double bonusPercent = 10;
		double bonus;
		double totalSalary;
		
		bonus = (salary/100) * bonusPercent;
		totalSalary = salary + bonus;
		
		System.out.println("Total Salary is : " + totalSalary);
	}

}
