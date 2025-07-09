package Encapsulation;

class Student{
	private String name, password;
	private int mark, rollNo;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNo, int mark, String name, String password) {
		this();
		this.rollNo = rollNo;
		this.mark = mark;
		this.name = name;
		this.password = password;
	}
	
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getPassword() {
		return this.password;
	}
	
	void setPassword(String password) {
		this.password = password;
	}
	
	int getRollNo(){
		return this.rollNo;
	}
	
	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	int getMark() {
		return this.mark;
	}
	
	void setMark(int mark) {
		this.mark = mark;
	}
	
	void updateMark(String password, int mark) {
		if(this.password == password) {
			this.mark = mark;
			System.out.println("Mark updated successfully");
			return;
		}
		System.out.println("Incorrect password!!");
	}
	
	void printStudentData() {
		System.out.println(this.name + " " + this.mark);
	}
	
	
}

public class StudetnDatabase {
	public static void main(String[] args) {
		Student s1 = new Student(01, 500, "Rithick roshan", "admin");
		Student s2 = new Student(02, 400, "arawind", "user n ");
		s1.updateMark("admin", 200);
		System.out.println(s2.getName());
	}

}
