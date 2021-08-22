package Assignment_Week3.Day1;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name");
	}

	public void studentDept() {
		System.out.println("Student Department");
	}
	public void studentID() {
		System.out.println("Student ID");
	}

	public static void main(String[] args) {
	
	Student stuObject = new Student();
	stuObject.collegeCode();
	stuObject.collegeName();
	stuObject.collegeRank();
	stuObject.deptName();
	stuObject.studentDept();
	stuObject.studentID();
	stuObject.studentName();
	}
}

