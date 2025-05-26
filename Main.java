package com.student.main;
import com.school.School;
import com.student.Student;
public class Main {
	public static void main(String[] args) {
		
		School school =School.getSchoolObject("Noble high school","miriyalaguda","improve student knowldge");
		Student student=Student.getStudentObject("Fayaz Ansari ", "A+", school, 96);
		if(school==null && student==null) {
			System.out.println("Enter all the details properly");
		}
		else {
			System.out.println("School details ");
			System.out.println(school);
			System.out.println("Student details");
			System.out.println(student);
		}
	}
	
	
		
		
	


}
	
