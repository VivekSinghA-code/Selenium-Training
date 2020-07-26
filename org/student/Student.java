package org.student;

import org.department.*;
public class Student extends Department {

	public void studentName() {
		System.out.println("Methd is student name");

	}
	public void studentDept() {
		System.out.println("Method is student department");

	}
	
	public void studentId() {
		System.out.println("MEthod is student ID");

	}
	public static void main(String[] args) {
		
		Student st=new Student();
		st.studentName();
		st.studentDept();
		st.studentId();
		st.deptname();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		
		
		

	}

}
