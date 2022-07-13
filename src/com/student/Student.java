package com.student;

public class Student {
	String firstName;
	String lastName;
	int rollNo;
	char department;
	String collegeName;
	
	
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", rollNo=" + rollNo + ", department="
				+ department + ", collegeName=" + collegeName + "]";
	}
	
	/*public Student(String firstName, String lastName, int rollNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
	}*/

	
}
