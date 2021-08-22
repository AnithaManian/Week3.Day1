package Assignment_Week3.Day1;

public class Students {

	public void getStudentInfo() {
		System.out.println("Get student Info");
	}
	
	public void getStudentInfo (int id) {
		System.out.println("The Student ID of method 1 is: " + id);
	}
	
	public void getStudentInfo (int id, String name) {
		System.out.println("The Student ID of method2 is :" + id);
		System.out.println("The Student Name of method2 is :" + name);
	}
	
	public void getStudentInfo (String email, long phonenumberl) {
		System.out.println("The Student email in method 3 is :" + email);
		System.out.println("The Student phone number in method 3 is :" + phonenumberl);
	}
	
	public static void main(String[] args) {
		Students objStud=new Students();
		objStud.getStudentInfo();
		objStud.getStudentInfo(1001);
		objStud.getStudentInfo(1005,"Anitha");
		objStud.getStudentInfo("anitha1nonly@gmail.com", 9581154411l);
	}
	
	
}
