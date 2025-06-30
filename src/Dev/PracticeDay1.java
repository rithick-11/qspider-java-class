package Dev;
import java.util.Scanner;

public class PracticeDay1 {
	
	
	static String getGrade(int percent) {
		
		String grade;
		
		if(percent >= 90) grade = "A Grade";
		else if (percent >= 80) grade = "B Grade";
		else if (percent >= 70) grade = "C Grade";
		else if (percent >= 60) grade = "D Grade";
		else if (percent >= 50) grade = "E Grade";
		else if (percent >= 35) grade = "Pass";
		else grade = "Fail";
		
		return grade;
		
	}

	public static void main(String[] args) {
		int math, phy, che, bio, cs, sci;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Maths mark :");
		math = sc.nextInt();
		System.out.println("Enter the Physics mark :");
		phy = sc.nextInt();
		System.out.println("Enter the Chemistry marks:");
		che = sc.nextInt();
		System.out.println("Enter the Biology mark :");
		bio = sc.nextInt();
		System.out.println("Enter the Com & Sci mark :");
		cs = sc.nextInt();
		System.out.println("Enter the Science marks:");
		sci = sc.nextInt();
		
		int percent = (math + phy + che + bio + cs + sci) / 6 ;
		
		System.out.println("Overall percentage :" + percent);
		
		String grade = getGrade(percent);
		
		System.out.println(grade);
		System.out.println("Math - " + getGrade(math));
		
		sc.close();
	}

}
