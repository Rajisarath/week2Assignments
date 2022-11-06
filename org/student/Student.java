package org.student;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("studentName");
	}
	public void studentDept() {
		System.out.println("studentDept");
	}
	public void studentId() {
		System.out.println("studentId");
	}
	public static void main(String[] args) {
		Student stud=new Student();
		stud.studentDept();
		stud.studentName();
		stud.studentId();
		System.out.println("--------->students");
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		System.out.println("------------>college");
		stud.deptName();
		System.out.println("---------->Department");
		
		
	}

}

