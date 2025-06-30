package Week1Practice;

public class RemainingStudents {

	public static void main(String[] args) {
		int totalStudents = 105;
		int busCapacity = 40;
		int remainingStudents;
		
		remainingStudents = totalStudents % busCapacity;
		
		System.out.println("Remaining students : " + remainingStudents);
	}

}
